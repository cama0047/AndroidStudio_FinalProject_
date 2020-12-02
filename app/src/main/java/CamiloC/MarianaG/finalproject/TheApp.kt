package CamiloC.MarianaG.finalproject

import android.app.Application
import android.content.Context

// This is a class driven from the built in Application class, it will manage the context of my toast method.
class TheApp : Application() {

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    // a companion object operates like the static part of this class, it contains a single variable of type context
    // that will be initialized later
    companion object{
        //lateinit means my variable will be initialized later
        lateinit var context: Context
            private set

    }
}