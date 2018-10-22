package info.nightscout.androidaps.plugins.PumpOmnipod.comm.message.command;

import org.junit.Test;

import info.nightscout.androidaps.plugins.PumpCommon.utils.ByteUtil;
import info.nightscout.androidaps.plugins.PumpOmnipod.defs.BeepType;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class CancelDeliveryCommandUnitTests {

    @Test
    public void Encode_ValidParams_CorrectBytes()
    {
        CancelDeliveryCommand command = new CancelDeliveryCommand(0x10203040, BeepType.Type3, true, false, true);

        byte[] expected = ByteUtil.fromHexString("1F051020304035");
        assertArrayEquals(expected, command.getRawData());
    }
}
