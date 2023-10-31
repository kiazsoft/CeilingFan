package com.bell;

import com.bell.Model.TableFan;
import com.bell.Model.TableFan;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TableFanTest extends TestCase
{
    private TableFan tableFan;

    @Before
    public void setUp() throws Exception {
        tableFan = new TableFan(3);
    }

    @Test
    public void testForSpeed_Initial_NotReversed( )
    {
        tableFan.pressSpeedButton();
        assertEquals(1, tableFan.getFanSpeed());
        assertEquals(false, tableFan.isFanDirectionReversed());
    }

    public void testForSpeed_Max_Reversed( )
    {
        tableFan.pressSpeedButton()
            .pressSpeedButton()
            .pressSpeedButton()
            .pressDirectionButton();
        assertEquals(3, tableFan.getFanSpeed());
        assertEquals(true, tableFan.isFanDirectionReversed());
    }

    public void testForSpeed_Reset( )
    {
        tableFan.pressSpeedButton()
            .pressSpeedButton()
            .pressSpeedButton()
            .pressSpeedButton();
        assertEquals(0, tableFan.getFanSpeed());
    }

    public void testForSpeed_3_Reversed_NotReversed( )
    {
        tableFan.pressSpeedButton()
            .pressSpeedButton()
            .pressSpeedButton()
            .pressDirectionButton()
            .pressDirectionButton();
        assertEquals(3, tableFan.getFanSpeed());
        assertEquals(false, tableFan.isFanDirectionReversed());
    }
}
