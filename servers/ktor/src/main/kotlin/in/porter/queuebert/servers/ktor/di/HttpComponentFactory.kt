package `in`.porter.queuebert.servers.ktor.di

import `in`.porter.queuebert.servers.commons.di.factories.ComponentsFactory

object HttpComponentFactory {

  fun build(): HttpComponent =
    DaggerHttpComponent.builder()
      .rootComponent(ComponentsFactory.rootComponent)
      .psqlDataComponent(ComponentsFactory.psqlDataComponent)
      .build()

}
