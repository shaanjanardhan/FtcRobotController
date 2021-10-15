package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "AutonRightBlue", group = "LinearOpMode")
public class AutonRightBlue {
    ShaanAutonomousMethods s = new ShaanAutonomousMethods();
    public void runOpMode() throws InterruptedException {
        //duck delivery; front facing the carousel with sides hugging the border
        //Front of robot placed on right side of (0,5)
        s.forward(12);
        s.LeftTurn(90);
        //turn carousel servo
        s.backward(24);
        //parked inside storage unit
        s.forward(6);
        s.strafeRight(35);
        //deliver preload


    }
}
