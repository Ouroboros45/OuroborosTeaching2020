package Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "Vision Test")
public class VisionTest extends LinearOpMode {

    BitmapVision vision;

    @Override
    public void runOpMode() throws InterruptedException {

        vision = new BitmapVision(this);
        waitForStart();

        vision.testVision(this);


    }
}
