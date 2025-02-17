package `in`.porter.queuebert.servers.sqs.di

import `in`.porter.kotlinutils.sqs.coroutines.drain.stream.StreamQueueDrainer
import `in`.porter.queuebert.api.models.async.AsyncJob
import `in`.porter.queuebert.data.di.PsqlDataComponent
import `in`.porter.queuebert.servers.commons.di.components.RootComponent
import `in`.porter.queuebert.servers.commons.usecases.external.Run
import dagger.Component

@SQSScope
@Component(
  dependencies = [
    RootComponent::class,
    PsqlDataComponent::class
  ],
  modules = [
    SQSModule::class
  ]
)
interface SQSComponent {
  val run: Run
  val drainer: StreamQueueDrainer<AsyncJob>
}
