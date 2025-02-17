package `in`.porter.queuebert.servers.sqs.di

import `in`.porter.queuebert.servers.commons.di.factories.ComponentsFactory

object SQSComponentFactory {

  fun build(): SQSComponent =
    DaggerSQSComponent.builder()
      .rootComponent(ComponentsFactory.rootComponent)
      .psqlDataComponent(ComponentsFactory.psqlDataComponent)
      .build()
}
