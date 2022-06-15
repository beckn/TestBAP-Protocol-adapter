package org.beckn.one.sandbox.bap.client.policy.controllers

import org.beckn.one.sandbox.bap.client.external.bap.ProtocolClient
import org.beckn.one.sandbox.bap.client.shared.controllers.AbstractOnPollController
import org.beckn.one.sandbox.bap.client.shared.dtos.*
import org.beckn.one.sandbox.bap.client.shared.services.GenericOnPollService
import org.beckn.one.sandbox.bap.client.shared.services.LoggingService
import org.beckn.one.sandbox.bap.factories.ContextFactory
import org.beckn.one.sandbox.bap.factories.LoggingFactory
import org.beckn.protocol.schemas.ProtocolContext
import org.beckn.protocol.schemas.ProtocolOnCancellationReasons
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class OnGetPolicyPollController @Autowired constructor(
  onPollService: GenericOnPollService<ProtocolOnCancellationReasons, ClientOrderPolicyResponse>,
  contextFactory: ContextFactory,
  val protocolClient: ProtocolClient,
  loggingFactory: LoggingFactory,
  loggingService: LoggingService,
) : AbstractOnPollController<ProtocolOnCancellationReasons, ClientOrderPolicyResponse>(onPollService, contextFactory, loggingFactory, loggingService) {

  @RequestMapping("/client/v1/on_cancellation_reasons")
  @ResponseBody
  fun onCancellationReasonsV1(
    @RequestParam messageId: String
  ): ResponseEntity<out ClientResponse> = onPoll(
      messageId,
      protocolClient.getOnCancellationReasonsResponsesCall(messageId),
      ProtocolContext.Action.ON_CANCEL
  )
}