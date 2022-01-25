package ru.ermolnik.archapp.di

import dagger.Component
import ru.ermolnik.archapp.App
import javax.inject.Singleton


@Component(
    dependencies = [AppFeatureDependencies::class],
    modules = [AppModule::class]
)
@Singleton
interface AppComponent : AppFeatureApi {
    fun inject(app: App)

    interface Builder {
        fun build(): AppComponent
    }

    companion object {
        fun initAndGet(dependencies: AppFeatureDependencies): AppComponent {
            return DaggerAppComponent.builder()
                .appFeatureDependencies(dependencies)
                .build()
        }

    }
}