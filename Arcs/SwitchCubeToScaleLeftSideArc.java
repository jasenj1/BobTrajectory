package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SwitchCubeToScaleLeftSideArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (18.13,18.65,0.00)
	// (24.13,20.15,0.00)
	
    public SwitchCubeToScaleLeftSideArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SwitchCubeToScaleLeftSideArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.595,-11.910,10.000,0.000},
				{-2.977,-35.730,10.000,0.000},
				{-8.337,-71.460,10.000,0.000},
				{-17.865,-119.100,10.000,0.000},
				{-32.752,-178.650,10.000,0.000},
				{-54.190,-250.110,10.000,0.000},
				{-83.370,-333.480,10.000,0.000},
				{-121.482,-428.760,10.000,0.000},
				{-169.717,-535.950,10.000,0.000},
				{-229.267,-655.050,10.000,0.000},
				{-301.323,-786.060,10.000,0.000},
				{-387.075,-928.980,10.000,0.000},
				{-487.714,-1083.810,10.000,0.010},
				{-604.432,-1250.549,10.000,0.010},
				{-738.420,-1429.199,10.000,0.010},
				{-890.868,-1619.759,10.000,0.020},
				{-1062.967,-1822.229,10.000,0.030},
				{-1255.909,-2036.609,10.000,0.040},
				{-1470.884,-2262.899,10.000,0.050},
				{-1709.084,-2501.099,10.000,0.070},
				{-1971.104,-2739.299,10.000,0.100},
				{-2256.944,-2977.499,10.000,0.120},
				{-2566.604,-3215.699,10.000,0.160},
				{-2900.084,-3453.899,10.000,0.200},
				{-3257.384,-3692.098,10.000,0.250},
				{-3638.503,-3930.298,10.000,0.320},
				{-4043.443,-4168.498,10.000,0.390},
				{-4472.203,-4406.698,10.000,0.470},
				{-4924.783,-4644.898,10.000,0.570},
				{-5401.183,-4883.098,10.000,0.680},
				{-5901.402,-5121.298,10.000,0.800},
				{-6425.442,-5359.498,10.000,0.940},
				{-6973.302,-5597.698,10.000,1.100},
				{-7544.982,-5835.897,10.000,1.280},
				{-8140.481,-6074.097,10.000,1.480},
				{-8759.801,-6312.297,10.000,1.700},
				{-9402.941,-6550.497,10.000,1.940},
				{-10069.901,-6788.697,10.000,2.200},
				{-10760.680,-7026.897,10.000,2.490},
				{-11475.280,-7265.097,10.000,2.800},
				{-12213.700,-7503.297,10.000,3.140},
				{-12975.939,-7741.497,10.000,3.500},
				{-13761.999,-7979.697,10.000,3.890},
				{-14571.879,-8217.896,10.000,4.310},
				{-15405.578,-8456.096,10.000,4.760},
				{-16263.098,-8694.296,10.000,5.230},
				{-17144.438,-8932.496,10.000,5.740},
				{-18049.597,-9170.696,10.000,6.270},
				{-18978.577,-9408.896,10.000,6.830},
				{-19931.376,-9647.096,10.000,7.420},
				{-20907.996,-9885.296,10.000,8.040},
				{-21908.436,-10123.496,10.000,8.680},
				{-22932.695,-10361.696,10.000,9.350},
				{-23980.775,-10599.895,10.000,10.040},
				{-25052.674,-10838.095,10.000,10.750},
				{-26148.394,-11076.295,10.000,11.490},
				{-27267.933,-11314.495,10.000,12.240},
				{-28411.293,-11552.695,10.000,13.010},
				{-29578.472,-11790.895,10.000,13.790},
				{-30769.472,-12029.095,10.000,14.570},
				{-31984.291,-12267.295,10.000,15.370},
				{-33222.931,-12505.495,10.000,16.170},
				{-34485.390,-12743.694,10.000,16.960},
				{-35771.074,-12969.984,10.000,17.750},
				{-37078.791,-13184.364,10.000,18.530},
				{-38407.351,-13386.834,10.000,19.290},
				{-39755.563,-13577.394,10.000,20.030},
				{-41122.235,-13756.044,10.000,20.750},
				{-42506.176,-13922.784,10.000,21.440},
				{-43906.196,-14077.614,10.000,22.100},
				{-45321.103,-14220.534,10.000,22.720},
				{-46749.707,-14351.544,10.000,23.300},
				{-48190.817,-14470.644,10.000,23.840},
				{-49643.241,-14577.834,10.000,24.330},
				{-51105.788,-14673.114,10.000,24.780},
				{-52577.268,-14756.484,10.000,25.170},
				{-54056.489,-14827.944,10.000,25.510},
				{-55542.261,-14887.494,10.000,25.790},
				{-57033.392,-14935.134,10.000,26.020},
				{-58528.692,-14970.864,10.000,26.200},
				{-60026.970,-14994.684,10.000,26.310},
				{-61527.033,-15006.594,10.000,26.370},
				{-63027.665,-15006.040,10.000,26.370},
				{-64527.646,-14993.576,10.000,26.310},
				{-66025.785,-14969.202,10.000,26.190},
				{-67520.891,-14932.918,10.000,26.010},
				{-69011.773,-14884.724,10.000,25.780},
				{-70497.240,-14824.620,10.000,25.490},
				{-71976.101,-14752.606,10.000,25.150},
				{-73447.166,-14668.682,10.000,24.760},
				{-74909.242,-14572.849,10.000,24.310},
				{-76361.140,-14465.105,10.000,23.820},
				{-77801.668,-14345.451,10.000,23.280},
				{-79229.635,-14213.887,10.000,22.690},
				{-80643.850,-14070.413,10.000,22.070},
				{-82043.122,-13915.029,10.000,21.410},
				{-83426.260,-13747.736,10.000,20.720},
				{-84792.073,-13568.532,10.000,20.000},
				{-86139.371,-13377.418,10.000,19.260},
				{-87466.962,-13174.394,10.000,18.490},
				{-88773.654,-12959.460,10.000,17.710},
				{-90058.258,-12732.617,10.000,16.920},
				{-91319.610,-12494.417,10.000,16.130},
				{-92557.141,-12256.217,10.000,15.330},
				{-93770.853,-12018.017,10.000,14.540},
				{-94960.745,-11779.817,10.000,13.750},
				{-96126.816,-11541.617,10.000,12.970},
				{-97269.068,-11303.417,10.000,12.200},
				{-98387.500,-11065.217,10.000,11.450},
				{-99482.112,-10827.017,10.000,10.720},
				{-100552.903,-10588.817,10.000,10.010},
				{-101599.875,-10350.618,10.000,9.320},
				{-102623.027,-10112.418,10.000,8.650},
				{-103622.359,-9874.218,10.000,8.010},
				{-104597.870,-9636.018,10.000,7.390},
				{-105549.562,-9397.818,10.000,6.800},
				{-106477.434,-9159.618,10.000,6.240},
				{-107381.486,-8921.418,10.000,5.710},
				{-108261.718,-8683.218,10.000,5.210},
				{-109118.130,-8445.018,10.000,4.740},
				{-109950.721,-8206.819,10.000,4.290},
				{-110759.493,-7968.619,10.000,3.870},
				{-111544.445,-7730.419,10.000,3.480},
				{-112305.577,-7492.219,10.000,3.120},
				{-113042.889,-7254.019,10.000,2.780},
				{-113756.381,-7015.819,10.000,2.470},
				{-114446.053,-6777.619,10.000,2.190},
				{-115111.905,-6539.419,10.000,1.920},
				{-115753.937,-6301.219,10.000,1.690},
				{-116372.149,-6063.019,10.000,1.470},
				{-116966.540,-5824.820,10.000,1.270},
				{-117537.112,-5586.620,10.000,1.100},
				{-118083.864,-5348.420,10.000,0.940},
				{-118606.796,-5110.220,10.000,0.800},
				{-119105.908,-4872.020,10.000,0.670},
				{-119581.200,-4633.820,10.000,0.560},
				{-120032.672,-4395.620,10.000,0.470},
				{-120460.324,-4157.420,10.000,0.380},
				{-120864.156,-3919.220,10.000,0.310},
				{-121244.168,-3681.020,10.000,0.250},
				{-121600.361,-3442.821,10.000,0.200},
				{-121932.733,-3204.621,10.000,0.160},
				{-122241.285,-2966.421,10.000,0.120},
				{-122526.017,-2728.221,10.000,0.090},
				{-122786.929,-2490.021,10.000,0.070},
				{-123024.049,-2252.375,10.000,0.050},
				{-123237.999,-2026.639,10.000,0.040},
				{-123429.972,-1812.813,10.000,0.030},
				{-123601.157,-1610.897,10.000,0.020},
				{-123752.747,-1420.891,10.000,0.010},
				{-123885.931,-1242.795,10.000,0.010},
				{-124001.901,-1076.609,10.000,0.010},
				{-124101.848,-922.333,10.000,0.000},
				{-124186.963,-779.967,10.000,0.000},
				{-124258.437,-649.511,10.000,0.000},
				{-124317.461,-530.965,10.000,0.000},
				{-124365.226,-424.329,10.000,0.000},
				{-124402.922,-329.603,10.000,0.000},
				{-124431.742,-246.787,10.000,0.000},
				{-124452.875,-175.880,10.000,0.000},
				{-124467.513,-116.884,10.000,0.000},
				{-124476.847,-69.798,10.000,0.000},
				{-124482.068,-34.622,10.000,0.000},
				{-124484.367,-11.356,10.000,0.000},
				{-124484.935,-0.000,10.000,0.000},
				{-124484.935,-0.000,10.000,0.000}		};

}