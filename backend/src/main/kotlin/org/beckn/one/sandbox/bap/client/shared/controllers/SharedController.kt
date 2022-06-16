package org.beckn.one.sandbox.bap.client.shared.controllers

import com.fasterxml.jackson.databind.ObjectMapper
import org.beckn.one.sandbox.bap.client.discovery.controllers.OnSearchCallbackController
import org.beckn.one.sandbox.bap.client.order.confirm.controllers.OnConfirmCallbackController
import org.beckn.one.sandbox.bap.client.order.init.controllers.OnInitCallbackController
import org.beckn.one.sandbox.bap.client.order.quote.controllers.OnGetQuoteCallbackController
import org.beckn.one.sandbox.bap.client.shared.dtos.SharedResponse
import org.beckn.one.sandbox.bap.factories.ContextFactory
import org.beckn.protocol.schemas.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.io.IOException
import java.util.*
import javax.servlet.http.HttpServletRequest

@RestController
class SharedController @Autowired constructor(
  val contextFactory: ContextFactory,
  val objectMapper: ObjectMapper,
  val onSearchCallbackController: OnSearchCallbackController,
  val onGetQuoteCallbackController: OnGetQuoteCallbackController,
  val onInitCallbackController: OnInitCallbackController,
  val onConfirmCallbackController: OnConfirmCallbackController,
) {

  @PostMapping(
    "/protocol/v1/redirect",
    consumes = [MediaType.APPLICATION_JSON_VALUE],
    produces = [MediaType.APPLICATION_JSON_VALUE],
  )
  fun onSharedCallback(request: HttpServletRequest): ResponseEntity<ProtocolAckResponse> {
    val parameter = extractPostRequestBody(request)
    val obj= objectMapper.readValue(parameter, SharedResponse::class.java)
    when(obj.context?.action) {
      ProtocolContext.Action.ON_SEARCH->{
        val request= objectMapper.readValue(parameter, ProtocolOnSearch::class.java)
        return onSearchCallbackController.onSearch(request)
      }
      ProtocolContext.Action.ON_SELECT->{
        val request= objectMapper.readValue(parameter, ProtocolOnSelect::class.java)
        return onGetQuoteCallbackController.onQuoteSelect(request)
      }
      ProtocolContext.Action.ON_INIT->{
        val request= objectMapper.readValue(parameter, ProtocolOnInit::class.java)
        return onInitCallbackController.onInitOrder(request)
      }
      ProtocolContext.Action.ON_CONFIRM->{
        val request= objectMapper.readValue(parameter, ProtocolOnConfirm::class.java)
        return onConfirmCallbackController.onConfirmOrder(request)
      }
      ProtocolContext.Action.ON_SUPPORT->{

      }
      ProtocolContext.Action.ON_CANCEL->{

      }
      ProtocolContext.Action.ON_TRACK->{

      }
      ProtocolContext.Action.ON_RATING->{

      }
      ProtocolContext.Action.ON_STATUS->{

      }
    }
    return ResponseEntity.ok(ProtocolAckResponse(null, ResponseMessage.ack()))
  }

  fun extractPostRequestBody(request: HttpServletRequest): String {
    if ("POST".equals(request.method, ignoreCase = true)) {
      return try {
        var s = Scanner(request.inputStream, "UTF-8").useDelimiter("\\A")
        if (s.hasNext()) s.next() else ""
      } catch (e: IOException) {
        e.printStackTrace()
        ""
      }
    }
    return ""
  }

}