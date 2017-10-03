package ch.ethz.inf.vs.a1.fstreun.vs_fstreun_sensors;


import android.hardware.Sensor;

import org.junit.Before;
import org.junit.Test;

import ch.ethz.inf.vs.a1.fstreun.vs_fstreun_sensors.SensorTypes;
import ch.ethz.inf.vs.a1.fstreun.vs_fstreun_sensors.SensorTypesImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by fabio on 10/2/17.
 * copied from the Code_skeleton file
 * https://www.vs.inf.ethz.ch/edu/VS/
 */

public class NumberValuesTest {

    @SuppressWarnings("WeakerAccess")
    SensorTypes mSensorTypes;

    @Before
    public void setupBeforeClass(){
        mSensorTypes = new SensorTypesImpl();
    }

    @Test
    public void accelerometerTest() throws Exception {
        assertEquals(mSensorTypes.getNumberValues(Sensor.TYPE_ACCELEROMETER), 3);
    }

    @Test
    public void ambientTemperatureTest() throws Exception {
        assertEquals(mSensorTypes.getNumberValues(Sensor.TYPE_AMBIENT_TEMPERATURE), 1);
    }

    @Test
    public void gravityTest() throws Exception {
        assertEquals(mSensorTypes.getNumberValues(Sensor.TYPE_GRAVITY), 3);
    }

    @Test
    public void gyroscopeTest() throws Exception {
        assertEquals(mSensorTypes.getNumberValues(Sensor.TYPE_GYROSCOPE), 3);
    }

    @Test
    public void lightTest() throws Exception {
        assertEquals(mSensorTypes.getNumberValues(Sensor.TYPE_LIGHT), 1);
    }

    @Test
    public void linearAccelerationTest() throws Exception {
        assertEquals(mSensorTypes.getNumberValues(Sensor.TYPE_LINEAR_ACCELERATION), 3);
    }

    @Test
    public void magneticFieldTest() throws Exception {
        assertEquals(mSensorTypes.getNumberValues(Sensor.TYPE_MAGNETIC_FIELD), 3);
    }

    @Test
    public void PressureTest() throws Exception {
        assertEquals(mSensorTypes.getNumberValues(Sensor.TYPE_PRESSURE), 1);
    }

    @Test
    public void RelativeHumidityTest() throws Exception {
        assertEquals(mSensorTypes.getNumberValues(Sensor.TYPE_RELATIVE_HUMIDITY), 1);
    }

    @Test
    public void RotationVectorTest() throws Exception {
        assertEquals(mSensorTypes.getNumberValues(Sensor.TYPE_ROTATION_VECTOR), 3);
    }
}
