package `in`.porter.queuebert.client.di

import `in`.porter.queuebert.client.clients.QueuebertHttpClient
import `in`.porter.queuebert.client.clients.QueuebertClient
import dagger.Binds
import dagger.Module

@Module
internal abstract class ClientModule {

  @Binds
  abstract fun provideAsyncJobsClient(client: QueuebertHttpClient): QueuebertClient
}
