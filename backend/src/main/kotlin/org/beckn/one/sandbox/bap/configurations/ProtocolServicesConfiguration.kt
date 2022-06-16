package org.beckn.one.sandbox.bap.configurations

import org.beckn.one.sandbox.bap.client.shared.services.PollForResponseService
import org.beckn.one.sandbox.bap.message.entities.*
import org.beckn.one.sandbox.bap.message.mappers.ProtocolGenericResponseMapper
import org.beckn.one.sandbox.bap.message.repositories.BecknProtocolResponseRepository
import org.beckn.one.sandbox.bap.message.services.MessageService
import org.beckn.one.sandbox.bap.message.services.ProtocolResponseStorageService
import org.beckn.one.sandbox.bap.message.services.ProtocolResponseStorageServiceImpl
import org.beckn.protocol.schemas.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ProtocolServicesConfiguration {
  @Bean
  fun onSearchStorageService(
    @Autowired responseRepo: BecknProtocolResponseRepository<OnSearchDao>,
    @Autowired mapper: ProtocolGenericResponseMapper<ProtocolOnSearch, OnSearchDao>
  ): ProtocolResponseStorageService<ProtocolOnSearch> = ProtocolResponseStorageServiceImpl(responseRepo, mapper)

  @Bean
  fun onSelectStorageService(
    @Autowired responseRepo: BecknProtocolResponseRepository<OnSelectDao>,
    @Autowired mapper: ProtocolGenericResponseMapper<ProtocolOnSelect, OnSelectDao>
  ): ProtocolResponseStorageService<ProtocolOnSelect> = ProtocolResponseStorageServiceImpl(responseRepo, mapper)


  @Bean
  fun onInitStorageService(
    @Autowired responseRepo: BecknProtocolResponseRepository<OnInitDao>,
    @Autowired mapper: ProtocolGenericResponseMapper<ProtocolOnInit, OnInitDao>
  ): ProtocolResponseStorageService<ProtocolOnInit> = ProtocolResponseStorageServiceImpl(responseRepo, mapper)

  @Bean
  fun onConfirmStorageService(
    @Autowired responseRepo: BecknProtocolResponseRepository<OnConfirmDao>,
    @Autowired mapper: ProtocolGenericResponseMapper<ProtocolOnConfirm, OnConfirmDao>
  ): ProtocolResponseStorageService<ProtocolOnConfirm> = ProtocolResponseStorageServiceImpl(responseRepo, mapper)

  @Bean
  fun onTrackStorageService(
    @Autowired responseRepo: BecknProtocolResponseRepository<OnTrackDao>,
    @Autowired mapper: ProtocolGenericResponseMapper<ProtocolOnTrack, OnTrackDao>,
  ): ProtocolResponseStorageService<ProtocolOnTrack> = ProtocolResponseStorageServiceImpl(responseRepo, mapper)

  @Bean
  fun onSupportStorageService(
    @Autowired responseRepo: BecknProtocolResponseRepository<OnSupportDao>,
    @Autowired mapper: ProtocolGenericResponseMapper<ProtocolOnSupport, OnSupportDao>
  ): ProtocolResponseStorageService<ProtocolOnSupport> = ProtocolResponseStorageServiceImpl(responseRepo, mapper)

  @Bean
  fun onRatingStorageService(
    @Autowired responseRepo: BecknProtocolResponseRepository<OnRatingDao>,
    @Autowired mapper: ProtocolGenericResponseMapper<ProtocolOnRating, OnRatingDao>,
  ): ProtocolResponseStorageService<ProtocolOnRating> = ProtocolResponseStorageServiceImpl(responseRepo, mapper)

  @Bean
  fun onCancelStorageService(
    @Autowired responseRepo: BecknProtocolResponseRepository<OnCancelDao>,
    @Autowired mapper: ProtocolGenericResponseMapper<ProtocolOnCancel, OnCancelDao>
  ): ProtocolResponseStorageService<ProtocolOnCancel> = ProtocolResponseStorageServiceImpl(responseRepo, mapper)

  @Bean
  fun onCancellationReasonsStorageService(
    @Autowired responseRepo: BecknProtocolResponseRepository<OnCancellationReasonDao>,
    @Autowired mapper: ProtocolGenericResponseMapper<ProtocolOnCancellationReasons, OnCancellationReasonDao>
  ): ProtocolResponseStorageService<ProtocolOnCancellationReasons> = ProtocolResponseStorageServiceImpl(responseRepo, mapper)

  @Bean
  fun onOrderStatusStorageService(
    @Autowired responseRepo: BecknProtocolResponseRepository<OnOrderStatusDao>,
    @Autowired mapper: ProtocolGenericResponseMapper<ProtocolOnOrderStatus, OnOrderStatusDao>,
  ): ProtocolResponseStorageService<ProtocolOnOrderStatus> = ProtocolResponseStorageServiceImpl(responseRepo, mapper)

  @Bean
  fun pollForSearchResponseService(
    messageService: MessageService,
    responseStorageService: ProtocolResponseStorageService<ProtocolOnSearch>
  ) = PollForResponseService(messageService, responseStorageService)

  @Bean
  fun pollForSelectResponseService(
    messageService: MessageService,
    responseStorageService: ProtocolResponseStorageService<ProtocolOnSelect>
  ) = PollForResponseService(messageService, responseStorageService)

  @Bean
  fun pollForInitResponseService(
    messageService: MessageService,
    responseStorageService: ProtocolResponseStorageService<ProtocolOnInit>
  ) = PollForResponseService(messageService, responseStorageService)

  @Bean
  fun pollForConfirmResponseService(
    messageService: MessageService,
    responseStorageService: ProtocolResponseStorageService<ProtocolOnConfirm>
  ) = PollForResponseService(messageService, responseStorageService)

  @Bean
  fun pollForTrackResponseService(
    messageService: MessageService,
    responseStorageService: ProtocolResponseStorageService<ProtocolOnTrack>
  ) = PollForResponseService(messageService, responseStorageService)

  @Bean
  fun pollForSupportResponseService(
    messageService: MessageService,
    responseStorageService: ProtocolResponseStorageService<ProtocolOnSupport>
  ) = PollForResponseService(messageService, responseStorageService)

  @Bean
  fun pollForRatingResponseService(
    messageService: MessageService,
    responseStorageService: ProtocolResponseStorageService<ProtocolOnRating>
  ) = PollForResponseService(messageService, responseStorageService)

  @Bean
  fun pollForCancelResponseService(
    messageService: MessageService,
    responseStorageService: ProtocolResponseStorageService<ProtocolOnCancel>
  ) = PollForResponseService(messageService, responseStorageService)

  @Bean
  fun pollForOrderStatusResponseService(
    messageService: MessageService,
    responseStorageService: ProtocolResponseStorageService<ProtocolOnOrderStatus>
  ) = PollForResponseService(messageService, responseStorageService)


  @Bean
  fun pollForCancellationReasonsResponseService(
    messageService: MessageService,
    responseStorageService: ProtocolResponseStorageService<ProtocolOnCancellationReasons>
  ) = PollForResponseService(messageService, responseStorageService)

}
