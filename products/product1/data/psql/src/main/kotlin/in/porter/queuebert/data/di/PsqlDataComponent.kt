package `in`.porter.queuebert.data.di

import dagger.BindsInstance
import dagger.Component
import io.micrometer.core.instrument.MeterRegistry
import org.jetbrains.exposed.sql.Database

@PsqlDataScope
@Component(
  modules =
  [
    UtilsModule::class
  ]
)
interface PsqlDataComponent {

  @Component.Builder
  interface Builder {
    @BindsInstance
    fun database(db: Database): Builder

    @BindsInstance
    fun meterRegistry(meterRegistry: MeterRegistry): Builder

    fun build(): PsqlDataComponent
  }

}
