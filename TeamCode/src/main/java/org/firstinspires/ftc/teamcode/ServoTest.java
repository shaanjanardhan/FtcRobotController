package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
@TeleOp(name = "ShaanServoTeleOp", group = "LinearOpMode")
public class ServoTest extends LinearOpMode{
    Servo carousel;
    public void runOpMode() {
        carousel = hardwareMap.get(Servo.class, "carousel");
        carousel.setDirection(Servo.Direction.FORWARD);
        waitForStart();
        carousel.setPosition(0.5);
    }
}



