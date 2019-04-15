package sample

import com.facebook.react.bridge.*

actual class Sample {
    actual fun checkMe() = 42
}

actual object Platform {
    actual fun name(): String = "JVM"
}

class AuthModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String {
        return "AuthModule"
    }

    @ReactMethod
    fun authState(promise: Promise) {
        try {
            promise.resolve("")
        } catch (e: Exception) {
            promise.reject("", "Unable to retrieve authentication state")
        }
    }
}