package info.nightscout.androidaps.plugins.pump.danaR.comm

import info.nightscout.androidaps.plugins.bus.RxBusWrapper
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.modules.junit4.PowerMockRunner

@RunWith(PowerMockRunner::class)
class MsgHistoryDailyInsulinTest : DanaRTestBase() {

    @Test fun runTest() {
        val packet = MsgHistoryDailyInsulin(aapsLogger, RxBusWrapper(aapsSchedulers))
        // nothing left to test
    }
}