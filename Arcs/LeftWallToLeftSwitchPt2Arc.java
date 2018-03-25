package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class LeftWallToLeftSwitchPt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (18.63,24.15,30.00)
	// (20.63,25.15,60.00)
	
    public LeftWallToLeftSwitchPt2Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftWallToLeftSwitchPt2Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.436,8.719,10.000,0.000},
				{2.180,26.157,10.000,30.000},
				{6.103,52.315,10.000,30.000},
				{13.079,87.191,10.000,30.000},
				{23.978,130.787,10.000,30.000},
				{39.672,183.102,10.000,29.999},
				{61.034,244.136,10.000,29.998},
				{88.935,313.889,10.000,29.996},
				{124.248,392.361,10.000,29.993},
				{167.843,479.552,10.000,29.987},
				{220.594,575.463,10.000,29.978},
				{283.372,680.092,10.000,29.963},
				{357.049,793.441,10.000,29.942},
				{442.496,915.509,10.000,29.911},
				{540.586,1046.296,10.000,29.869},
				{652.191,1185.802,10.000,29.810},
				{778.183,1334.028,10.000,29.732},
				{919.433,1490.972,10.000,29.630},
				{1076.813,1656.636,10.000,29.498},
				{1251.196,1831.018,10.000,29.331},
				{1443.017,2005.401,10.000,29.122},
				{1652.276,2179.784,10.000,28.865},
				{1878.973,2354.166,10.000,28.556},
				{2123.109,2528.549,10.000,28.188},
				{2384.683,2702.932,10.000,27.758},
				{2663.696,2877.314,10.000,27.259},
				{2960.146,3051.697,10.000,26.689},
				{3274.035,3226.080,10.000,26.045},
				{3605.362,3400.462,10.000,25.326},
				{3954.127,3574.845,10.000,24.531},
				{4320.331,3749.228,10.000,23.662},
				{4703.973,3923.610,10.000,22.722},
				{5105.053,4097.993,10.000,21.716},
				{5523.572,4272.376,10.000,20.652},
				{5959.528,4446.758,10.000,19.539},
				{6412.923,4621.141,10.000,18.388},
				{6883.321,4786.805,10.000,17.212},
				{7369.848,4943.749,10.000,16.030},
				{7871.634,5091.974,10.000,14.857},
				{8387.807,5231.481,10.000,13.712},
				{8917.495,5362.268,10.000,12.612},
				{9459.825,5484.335,10.000,11.574},
				{10013.926,5597.684,10.000,10.614},
				{10578.926,5702.314,10.000,9.746},
				{11153.953,5798.224,10.000,8.985},
				{11738.135,5885.416,10.000,8.341},
				{12330.600,5963.888,10.000,7.827},
				{12930.476,6033.641,10.000,7.451},
				{13536.892,6094.675,10.000,7.222},
				{14148.975,6146.990,10.000,7.150},
				{14765.854,6190.585,10.000,7.241},
				{15386.656,6225.462,10.000,7.504},
				{16010.510,6251.619,10.000,7.946},
				{16636.544,6269.058,10.000,8.574},
				{17263.886,6277.777,10.000,9.395},
				{17891.354,6271.588,10.000,10.413},
				{18517.768,6256.680,10.000,11.633},
				{19142.254,6233.053,10.000,13.054},
				{19763.942,6200.706,10.000,14.677},
				{20381.959,6159.641,10.000,16.495},
				{20995.434,6109.856,10.000,18.496},
				{21603.495,6051.353,10.000,20.665},
				{22205.269,5984.130,10.000,22.978},
				{22799.885,5908.188,10.000,25.404},
				{23386.471,5823.527,10.000,27.909},
				{23964.154,5730.147,10.000,30.453},
				{24532.064,5628.047,10.000,32.995},
				{25089.328,5517.229,10.000,35.498},
				{25635.074,5397.691,10.000,37.924},
				{26168.430,5269.435,10.000,40.244},
				{26688.525,5132.459,10.000,42.435},
				{27194.486,4986.764,10.000,44.478},
				{27685.442,4832.349,10.000,46.365},
				{28160.520,4669.216,10.000,48.090},
				{28618.849,4497.364,10.000,49.653},
				{29059.866,4322.981,10.000,51.060},
				{29483.445,4148.598,10.000,52.318},
				{29889.586,3974.216,10.000,53.437},
				{30278.288,3799.833,10.000,54.427},
				{30649.552,3625.450,10.000,55.299},
				{31003.378,3451.068,10.000,56.062},
				{31339.766,3276.685,10.000,56.726},
				{31658.715,3102.302,10.000,57.301},
				{31960.226,2927.920,10.000,57.795},
				{32244.299,2753.537,10.000,58.216},
				{32510.934,2579.154,10.000,58.571},
				{32760.130,2404.772,10.000,58.870},
				{32991.888,2230.389,10.000,59.117},
				{33206.208,2056.006,10.000,59.319},
				{33403.089,1881.623,10.000,59.482},
				{33582.532,1707.241,10.000,59.613},
				{33744.847,1539.047,10.000,59.714},
				{33890.778,1379.572,10.000,59.793},
				{34021.197,1228.817,10.000,59.853},
				{34136.977,1086.780,10.000,59.898},
				{34238.989,953.463,10.000,59.931},
				{34328.106,828.865,10.000,59.954},
				{34405.198,712.986,10.000,59.971},
				{34471.139,605.826,10.000,59.982},
				{34526.799,507.385,10.000,59.989},
				{34573.052,417.664,10.000,59.994},
				{34610.768,336.661,10.000,59.997},
				{34640.820,264.378,10.000,59.998},
				{34664.080,200.814,10.000,59.999},
				{34681.419,145.969,10.000,60.000},
				{34693.709,99.843,10.000,60.000},
				{34701.823,62.436,10.000,60.000},
				{34706.632,33.748,10.000,60.000},
				{34709.009,13.780,10.000,60.000},
				{34709.824,2.530,10.000,60.000},
				{34709.951,0.000,10.000,60.000},
				{34709.951,0.000,10.000,60.000}		};

}