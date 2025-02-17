package `in`.porter.queuebert.servers.ktor.di

import `in`.porter.queuebert.servers.commons.di.components.RootComponent
import `in`.porter.queuebert.servers.commons.usecases.external.Run
import `in`.porter.queuebert.data.di.PsqlDataComponent

import dagger.Component

@HttpScope
@Component(
  dependencies = [
    RootComponent::class,
    PsqlDataComponent::class
  ]
)
interface HttpComponent {
  val run: Run
}
