package ru.ermolnik.archapp.di

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Singleton
    @Binds
    abstract fun provideLogger(logger: LoggerImpl): Logger

}