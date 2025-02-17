package `in`.porter.queuebert.client.di

import `in`.porter.queuebert.client.clients.QueuebertClient
import `in`.porter.queuebert.client.config.ClientConfig
import dagger.BindsInstance
import dagger.Component

@ClientScope
@Component(
  modules = [
    ClientModule::class,
    UtilsModule::class
  ]
)
interface QUEUEBERTClientComponent {
  val queuebertClient: QueuebertClient

  @Component.Builder
  interface Builder {

    @BindsInstance
    fun config(config: ClientConfig): Builder

    fun build(): QUEUEBERTClientComponent
  }
}
