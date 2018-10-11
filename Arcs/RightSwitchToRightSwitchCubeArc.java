package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightSwitchToRightSwitchCubeArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (18.08,7.94,-40.00)
	// (19.33,6.69,-40.00)
	
    public RightSwitchToRightSwitchCubeArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightSwitchToRightSwitchCubeArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.584,-11.678,10.000,-40.000},
				{-2.919,-35.034,10.000,-40.000},
				{-8.175,-70.067,10.000,-40.000},
				{-17.517,-116.779,10.000,-40.000},
				{-32.114,-175.169,10.000,-40.000},
				{-53.134,-245.236,10.000,-40.000},
				{-81.745,-326.981,10.000,-40.001},
				{-119.115,-420.405,10.000,-40.002},
				{-166.410,-525.506,10.000,-40.003},
				{-224.800,-642.285,10.000,-40.006},
				{-294.867,-759.064,10.000,-40.010},
				{-376.612,-875.843,10.000,-40.017},
				{-470.036,-992.622,10.000,-40.026},
				{-575.137,-1109.401,10.000,-40.039},
				{-691.916,-1226.180,10.000,-40.056},
				{-820.373,-1342.959,10.000,-40.078},
				{-960.508,-1459.738,10.000,-40.106},
				{-1112.321,-1576.517,10.000,-40.141},
				{-1275.811,-1693.296,10.000,-40.184},
				{-1450.980,-1810.075,10.000,-40.235},
				{-1637.826,-1926.854,10.000,-40.297},
				{-1836.351,-2043.633,10.000,-40.369},
				{-2046.553,-2160.413,10.000,-40.452},
				{-2268.433,-2277.192,10.000,-40.548},
				{-2501.991,-2393.971,10.000,-40.658},
				{-2747.227,-2510.750,10.000,-40.781},
				{-3004.141,-2627.529,10.000,-40.919},
				{-3272.733,-2744.308,10.000,-41.073},
				{-3553.003,-2861.087,10.000,-41.243},
				{-3844.950,-2977.866,10.000,-41.430},
				{-4148.576,-3094.645,10.000,-41.633},
				{-4463.879,-3211.424,10.000,-41.853},
				{-4790.861,-3328.203,10.000,-42.090},
				{-5129.520,-3444.982,10.000,-42.343},
				{-5479.857,-3561.761,10.000,-42.613},
				{-5841.872,-3678.540,10.000,-42.898},
				{-6215.565,-3795.319,10.000,-43.199},
				{-6600.936,-3912.098,10.000,-43.513},
				{-6997.985,-4028.877,10.000,-43.841},
				{-7406.712,-4145.656,10.000,-44.179},
				{-7827.116,-4262.436,10.000,-44.527},
				{-8259.199,-4379.215,10.000,-44.883},
				{-8702.959,-4495.994,10.000,-45.245},
				{-9158.397,-4612.773,10.000,-45.610},
				{-9625.514,-4729.552,10.000,-45.976},
				{-10104.308,-4846.331,10.000,-46.340},
				{-10594.780,-4963.110,10.000,-46.699},
				{-11096.930,-5079.889,10.000,-47.049},
				{-11610.758,-5196.668,10.000,-47.389},
				{-12136.263,-5313.447,10.000,-47.713},
				{-12672.863,-5418.548,10.000,-48.019},
				{-13219.389,-5511.971,10.000,-48.302},
				{-13774.673,-5593.717,10.000,-48.559},
				{-14337.549,-5663.784,10.000,-48.785},
				{-14906.846,-5722.174,10.000,-48.979},
				{-15481.399,-5768.885,10.000,-49.136},
				{-16060.040,-5803.919,10.000,-49.256},
				{-16641.599,-5827.275,10.000,-49.335},
				{-17224.911,-5838.953,10.000,-49.374},
				{-17808.724,-5837.318,10.000,-49.371},
				{-18391.790,-5824.005,10.000,-49.326},
				{-18972.941,-5799.015,10.000,-49.241},
				{-19551.009,-5762.347,10.000,-49.117},
				{-20124.827,-5714.000,10.000,-48.954},
				{-20693.226,-5653.976,10.000,-48.756},
				{-21255.038,-5582.274,10.000,-48.525},
				{-21809.097,-5498.894,10.000,-48.264},
				{-22354.233,-5403.836,10.000,-47.978},
				{-22889.280,-5297.100,10.000,-47.669},
				{-23413.151,-5180.321,10.000,-47.342},
				{-23925.344,-5063.542,10.000,-47.001},
				{-24425.859,-4946.763,10.000,-46.649},
				{-24914.697,-4829.984,10.000,-46.290},
				{-25391.856,-4713.205,10.000,-45.925},
				{-25857.338,-4596.426,10.000,-45.560},
				{-26311.141,-4479.647,10.000,-45.195},
				{-26753.267,-4362.868,10.000,-44.834},
				{-27183.715,-4246.089,10.000,-44.479},
				{-27602.485,-4129.310,10.000,-44.132},
				{-28009.577,-4012.531,10.000,-43.795},
				{-28404.991,-3895.752,10.000,-43.469},
				{-28788.727,-3778.972,10.000,-43.156},
				{-29160.785,-3662.193,10.000,-42.858},
				{-29521.166,-3545.414,10.000,-42.575},
				{-29869.868,-3428.635,10.000,-42.307},
				{-30206.893,-3311.856,10.000,-42.056},
				{-30532.239,-3195.077,10.000,-41.821},
				{-30845.908,-3078.298,10.000,-41.604},
				{-31147.899,-2961.519,10.000,-41.403},
				{-31438.212,-2844.740,10.000,-41.219},
				{-31716.847,-2727.961,10.000,-41.051},
				{-31983.804,-2611.182,10.000,-40.900},
				{-32239.083,-2494.403,10.000,-40.763},
				{-32482.685,-2377.624,10.000,-40.642},
				{-32714.608,-2260.845,10.000,-40.534},
				{-32934.854,-2144.066,10.000,-40.440},
				{-33143.421,-2027.287,10.000,-40.358},
				{-33340.311,-1910.508,10.000,-40.288},
				{-33525.523,-1793.729,10.000,-40.228},
				{-33699.057,-1676.949,10.000,-40.178},
				{-33860.913,-1560.170,10.000,-40.136},
				{-34011.091,-1443.391,10.000,-40.102},
				{-34149.591,-1326.612,10.000,-40.075},
				{-34276.413,-1209.833,10.000,-40.053},
				{-34391.558,-1093.054,10.000,-40.037},
				{-34495.024,-976.275,10.000,-40.025},
				{-34586.813,-859.496,10.000,-40.016},
				{-34666.923,-742.717,10.000,-40.010},
				{-34735.356,-625.938,10.000,-40.006},
				{-34792.193,-510.794,10.000,-40.003},
				{-34838.099,-407.327,10.000,-40.002},
				{-34874.242,-315.539,10.000,-40.001},
				{-34901.790,-235.428,10.000,-40.000},
				{-34921.911,-166.995,10.000,-40.000},
				{-34935.773,-110.240,10.000,-40.000},
				{-34944.543,-65.163,10.000,-40.000},
				{-34949.390,-31.764,10.000,-40.000},
				{-34951.480,-10.043,10.000,-40.000},
				{-34951.982,-0.000,10.000,-40.000},
				{-34951.982,-0.000,10.000,-40.000}		};

}