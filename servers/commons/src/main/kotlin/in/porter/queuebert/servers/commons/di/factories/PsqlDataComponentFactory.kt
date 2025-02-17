package `in`.porter.queuebert.servers.commons.di.factories

import `in`.porter.queuebert.data.di.DaggerPsqlDataComponent
import `in`.porter.queuebert.servers.commons.di.components.RootComponent
import `in`.porter.queuebert.data.di.PsqlDataComponent

object PsqlDataComponentFactory {

  fun build(rootComponent: RootComponent): PsqlDataComponent =
    DaggerPsqlDataComponent.builder()
      .database(rootComponent.database)
      .meterRegistry(rootComponent.meterRegistry)
      .build()

}
