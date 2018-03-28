package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class ScaleToSwitchCubeLeftSideArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (24.13,17.65,-10.00)
	// (19.13,16.40,0.00)
	
    public ScaleToSwitchCubeLeftSideArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ScaleToSwitchCubeLeftSideArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.567,11.347,10.000,-10.000},
				{2.837,34.040,10.000,-10.000},
				{7.943,68.081,10.000,-10.000},
				{17.020,113.468,10.000,-10.000},
				{31.204,170.202,10.000,-10.000},
				{51.628,238.283,10.000,-10.000},
				{79.428,317.710,10.000,-10.000},
				{115.737,408.484,10.000,-9.999},
				{161.692,510.606,10.000,-9.999},
				{218.426,624.073,10.000,-9.998},
				{287.074,748.888,10.000,-9.997},
				{368.771,885.050,10.000,-9.994},
				{464.651,1032.558,10.000,-9.991},
				{575.850,1191.413,10.000,-9.986},
				{702.934,1350.268,10.000,-9.980},
				{845.903,1509.123,10.000,-9.970},
				{1004.758,1667.978,10.000,-9.958},
				{1179.499,1826.833,10.000,-9.943},
				{1370.125,1985.688,10.000,-9.923},
				{1576.636,2144.543,10.000,-9.898},
				{1799.033,2303.398,10.000,-9.868},
				{2037.316,2462.253,10.000,-9.832},
				{2291.484,2621.108,10.000,-9.788},
				{2561.538,2779.963,10.000,-9.736},
				{2847.477,2938.818,10.000,-9.675},
				{3149.301,3097.673,10.000,-9.604},
				{3467.011,3256.528,10.000,-9.523},
				{3800.607,3415.383,10.000,-9.429},
				{4150.088,3574.239,10.000,-9.323},
				{4515.455,3733.094,10.000,-9.202},
				{4896.707,3891.949,10.000,-9.066},
				{5293.844,4050.804,10.000,-8.915},
				{5706.867,4209.659,10.000,-8.745},
				{6135.776,4368.514,10.000,-8.558},
				{6580.570,4527.369,10.000,-8.350},
				{7041.250,4686.224,10.000,-8.122},
				{7517.815,4845.079,10.000,-7.871},
				{8010.266,5003.934,10.000,-7.597},
				{8518.602,5162.789,10.000,-7.299},
				{9042.823,5321.644,10.000,-6.974},
				{9582.931,5480.499,10.000,-6.623},
				{10138.923,5639.354,10.000,-6.243},
				{10710.801,5798.209,10.000,-5.834},
				{11298.565,5957.064,10.000,-5.394},
				{11902.214,6115.919,10.000,-4.922},
				{12521.749,6274.774,10.000,-4.418},
				{13157.169,6433.629,10.000,-3.879},
				{13808.475,6592.484,10.000,-3.305},
				{14475.666,6751.339,10.000,-2.696},
				{15158.743,6910.194,10.000,-2.050},
				{15857.705,7069.050,10.000,-1.367},
				{16572.553,7227.905,10.000,-0.646},
				{17303.286,7386.760,10.000,0.113},
				{18049.904,7545.615,10.000,0.909},
				{18812.409,7704.470,10.000,1.743},
				{19590.798,7863.325,10.000,2.614},
				{20385.074,8022.180,10.000,3.521},
				{21195.234,8181.035,10.000,4.463},
				{22021.281,8339.890,10.000,5.438},
				{22863.212,8498.745,10.000,6.445},
				{23721.030,8657.600,10.000,7.481},
				{24594.732,8816.455,10.000,8.542},
				{25484.321,8975.310,10.000,9.627},
				{26389.794,9134.165,10.000,10.730},
				{27311.154,9293.020,10.000,11.849},
				{28248.398,9451.875,10.000,12.979},
				{29201.529,9610.730,10.000,14.114},
				{30170.544,9769.585,10.000,15.251},
				{31155.446,9928.440,10.000,16.384},
				{32156.232,10087.295,10.000,17.508},
				{33172.905,10246.150,10.000,18.618},
				{34205.463,10405.005,10.000,19.708},
				{35253.906,10563.860,10.000,20.774},
				{36318.235,10722.716,10.000,21.810},
				{37398.449,10881.571,10.000,22.811},
				{38493.981,11029.079,10.000,23.773},
				{39603.697,11165.240,10.000,24.690},
				{40726.462,11290.055,10.000,25.559},
				{41861.141,11403.523,10.000,26.373},
				{43006.599,11505.644,10.000,27.131},
				{44161.703,11596.418,10.000,27.830},
				{45325.316,11675.846,10.000,28.466},
				{46496.304,11743.927,10.000,29.038},
				{47673.534,11800.660,10.000,29.544},
				{48855.869,11846.048,10.000,29.983},
				{50042.176,11880.088,10.000,30.354},
				{51231.319,11902.782,10.000,30.658},
				{52422.165,11914.128,10.000,30.892},
				{53613.183,11906.231,10.000,31.059},
				{54802.844,11886.986,10.000,31.157},
				{55990.013,11856.395,10.000,31.188},
				{57173.555,11814.457,10.000,31.152},
				{58352.337,11761.172,10.000,31.051},
				{59525.223,11696.541,10.000,30.885},
				{60691.078,11620.563,10.000,30.657},
				{61848.768,11533.237,10.000,30.367},
				{62997.158,11434.566,10.000,30.018},
				{64135.113,11324.547,10.000,29.613},
				{65261.500,11203.181,10.000,29.153},
				{66375.182,11070.469,10.000,28.641},
				{67475.026,10926.410,10.000,28.080},
				{68559.897,10771.004,10.000,27.475},
				{69629.055,10612.149,10.000,26.827},
				{70682.327,10453.294,10.000,26.142},
				{71719.713,10294.439,10.000,25.421},
				{72741.215,10135.584,10.000,24.669},
				{73746.830,9976.729,10.000,23.889},
				{74736.560,9817.874,10.000,23.085},
				{75710.405,9659.019,10.000,22.260},
				{76668.364,9500.164,10.000,21.419},
				{77610.438,9341.309,10.000,20.564},
				{78536.626,9182.454,10.000,19.701},
				{79446.928,9023.599,10.000,18.832},
				{80341.346,8864.744,10.000,17.962},
				{81219.877,8705.888,10.000,17.093},
				{82082.523,8547.033,10.000,16.230},
				{82929.284,8388.178,10.000,15.375},
				{83760.159,8229.323,10.000,14.532},
				{84575.149,8070.468,10.000,13.704},
				{85374.253,7911.613,10.000,12.893},
				{86157.471,7752.758,10.000,12.101},
				{86924.804,7593.903,10.000,11.331},
				{87676.252,7435.048,10.000,10.585},
				{88411.814,7276.193,10.000,9.863},
				{89131.490,7117.338,10.000,9.168},
				{89835.282,6958.483,10.000,8.501},
				{90523.187,6799.628,10.000,7.861},
				{91195.207,6640.773,10.000,7.251},
				{91851.342,6481.918,10.000,6.670},
				{92491.591,6323.063,10.000,6.118},
				{93115.954,6164.208,10.000,5.596},
				{93724.432,6005.353,10.000,5.103},
				{94317.025,5846.498,10.000,4.640},
				{94893.732,5687.643,10.000,4.205},
				{95454.553,5528.788,10.000,3.798},
				{95999.489,5369.933,10.000,3.418},
				{96528.540,5211.078,10.000,3.065},
				{97041.705,5052.222,10.000,2.738},
				{97538.984,4893.367,10.000,2.436},
				{98020.378,4734.512,10.000,2.158},
				{98485.887,4575.657,10.000,1.903},
				{98935.510,4416.802,10.000,1.670},
				{99369.247,4257.947,10.000,1.458},
				{99787.099,4099.092,10.000,1.266},
				{100189.066,3940.237,10.000,1.093},
				{100575.147,3781.382,10.000,0.938},
				{100945.342,3622.527,10.000,0.799},
				{101299.652,3463.672,10.000,0.676},
				{101638.076,3304.817,10.000,0.568},
				{101960.615,3145.962,10.000,0.473},
				{102267.269,2987.107,10.000,0.390},
				{102558.037,2828.252,10.000,0.318},
				{102832.919,2669.397,10.000,0.257},
				{103091.916,2510.542,10.000,0.205},
				{103335.028,2351.687,10.000,0.161},
				{103562.254,2192.832,10.000,0.125},
				{103773.594,2033.977,10.000,0.095},
				{103969.049,1875.122,10.000,0.071},
				{104148.618,1716.267,10.000,0.052},
				{104312.302,1557.411,10.000,0.037},
				{104460.101,1398.556,10.000,0.026},
				{104592.013,1239.701,10.000,0.018},
				{104708.041,1080.846,10.000,0.012},
				{104808.578,929.889,10.000,0.007},
				{104894.586,790.278,10.000,0.005},
				{104967.201,662.014,10.000,0.003},
				{105027.556,545.097,10.000,0.002},
				{105076.787,439.527,10.000,0.001},
				{105116.029,345.304,10.000,0.000},
				{105146.415,262.427,10.000,0.000},
				{105169.082,190.897,10.000,0.000},
				{105185.162,130.714,10.000,0.000},
				{105195.792,81.877,10.000,0.000},
				{105202.105,44.388,10.000,0.000},
				{105205.237,18.245,10.000,0.000},
				{105206.321,3.449,10.000,0.000},
				{105206.494,0.000,10.000,-0.000},
				{105206.494,0.000,10.000,-0.000}		};

}