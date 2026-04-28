import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Test

class InstrumentedTestExample {
    @Test
    fun testPackageName(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        assert(context.packageName=="com.bensalcie.kmmbasics")

    }
}