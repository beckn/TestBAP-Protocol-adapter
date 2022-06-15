package org.beckn.one.sandbox.bap.client.discovery.controllers

import org.beckn.one.sandbox.bap.client.shared.controllers.AbstractCallbackController
import org.beckn.one.sandbox.bap.client.shared.services.LoggingService
import org.beckn.one.sandbox.bap.factories.LoggingFactory
import org.beckn.one.sandbox.bap.message.services.ProtocolResponseStorageService
import org.beckn.protocol.schemas.ProtocolContext
import org.beckn.protocol.schemas.ProtocolOnSearch
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class OnSearchCallbackController @Autowired constructor(
  store: ProtocolResponseStorageService<ProtocolOnSearch>,
  loggingFactory: LoggingFactory,
  loggingService: LoggingService
): AbstractCallbackController<ProtocolOnSearch>(store, loggingFactory, loggingService) {

  @PostMapping(
    "client/v1/on_search",
    consumes = [MediaType.APPLICATION_JSON_VALUE],
    produces = [MediaType.APPLICATION_JSON_VALUE],
  )
  fun onSearch(@RequestBody searchResponse: ProtocolOnSearch) = onCallback(
    searchResponse,
    ProtocolContext.Action.ON_SEARCH
  )

}