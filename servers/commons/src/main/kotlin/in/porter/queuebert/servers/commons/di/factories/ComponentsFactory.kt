package `in`.porter.queuebert.servers.commons.di.factories

import  `in`.porter.queuebert.servers.commons.di.components.DaggerRootComponent

object ComponentsFactory {

  val rootComponent = DaggerRootComponent.create()
  val psqlDataComponent = PsqlDataComponentFactory.build(rootComponent)

}
