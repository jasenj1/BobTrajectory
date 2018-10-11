package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightWallToRightSwitchPt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (21.63,4.39,-5.00)
	// (18.08,7.94,-40.00)
	
    public RightWallToRightSwitchPt2Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightWallToRightSwitchPt2Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.574,11.474,10.000,-5.000},
				{2.868,34.421,10.000,-5.000},
				{8.032,68.843,10.000,-5.000},
				{17.211,114.738,10.000,-5.000},
				{31.553,172.107,10.000,-5.000},
				{52.206,240.950,10.000,-5.000},
				{80.317,321.267,10.000,-5.000},
				{117.033,413.057,10.000,-5.000},
				{163.502,516.322,10.000,-5.001},
				{220.871,631.060,10.000,-5.002},
				{290.288,757.272,10.000,-5.003},
				{372.899,894.958,10.000,-5.004},
				{469.853,1044.117,10.000,-5.007},
				{582.296,1204.751,10.000,-5.011},
				{711.377,1376.858,10.000,-5.016},
				{858.241,1560.439,10.000,-5.024},
				{1024.038,1755.494,10.000,-5.034},
				{1209.914,1962.023,10.000,-5.047},
				{1417.016,2180.025,10.000,-5.064},
				{1646.493,2409.501,10.000,-5.086},
				{1899.490,2650.452,10.000,-5.114},
				{2177.157,2902.876,10.000,-5.150},
				{2480.639,3166.773,10.000,-5.194},
				{2811.085,3442.145,10.000,-5.248},
				{3169.642,3728.990,10.000,-5.314},
				{3556.883,4015.836,10.000,-5.394},
				{3972.809,4302.681,10.000,-5.490},
				{4417.419,4589.527,10.000,-5.603},
				{4890.714,4876.372,10.000,-5.737},
				{5392.694,5163.217,10.000,-5.893},
				{5923.358,5450.063,10.000,-6.073},
				{6482.706,5736.908,10.000,-6.281},
				{7070.740,6023.754,10.000,-6.519},
				{7687.457,6310.599,10.000,-6.791},
				{8332.859,6597.445,10.000,-7.098},
				{9006.946,6884.290,10.000,-7.446},
				{9709.717,7171.135,10.000,-7.837},
				{10441.173,7457.981,10.000,-8.276},
				{11201.313,7744.826,10.000,-8.766},
				{11990.138,8031.672,10.000,-9.313},
				{12807.648,8318.517,10.000,-9.920},
				{13653.842,8605.362,10.000,-10.595},
				{14528.720,8892.208,10.000,-11.341},
				{15432.283,9179.053,10.000,-12.166},
				{16364.531,9465.899,10.000,-13.076},
				{17325.463,9752.744,10.000,-14.077},
				{18315.080,10039.590,10.000,-15.176},
				{19333.381,10326.435,10.000,-16.382},
				{20380.367,10613.280,10.000,-17.700},
				{21456.037,10900.126,10.000,-19.138},
				{22559.818,11175.497,10.000,-20.701},
				{23690.563,11439.395,10.000,-22.393},
				{24847.124,11691.819,10.000,-24.215},
				{26028.353,11932.769,10.000,-26.166},
				{27233.104,12162.246,10.000,-28.240},
				{28460.228,12380.248,10.000,-30.430},
				{29708.580,12586.777,10.000,-32.723},
				{30977.010,12781.832,10.000,-35.101},
				{32264.372,12965.413,10.000,-37.544},
				{33569.519,13137.520,10.000,-40.025},
				{34891.303,13298.153,10.000,-42.518},
				{36228.576,13447.313,10.000,-44.993},
				{37580.192,13584.999,10.000,-47.423},
				{38945.002,13711.211,10.000,-49.780},
				{40321.860,13825.949,10.000,-52.041},
				{41709.618,13929.213,10.000,-54.186},
				{43107.129,14021.004,10.000,-56.200},
				{44513.245,14101.321,10.000,-58.073},
				{45926.820,14170.164,10.000,-59.796},
				{47346.704,14227.533,10.000,-61.367},
				{48771.752,14273.428,10.000,-62.785},
				{50200.816,14307.849,10.000,-64.050},
				{51632.749,14330.797,10.000,-65.166},
				{53066.402,14342.271,10.000,-66.137},
				{54500.181,14333.313,10.000,-66.968},
				{55932.491,14312.881,10.000,-67.662},
				{57362.184,14280.975,10.000,-68.225},
				{58788.112,14237.595,10.000,-68.662},
				{60209.129,14182.742,10.000,-68.979},
				{61624.087,14116.415,10.000,-69.179},
				{63031.838,14038.613,10.000,-69.266},
				{64431.236,13949.339,10.000,-69.245},
				{65821.132,13848.590,10.000,-69.120},
				{67200.380,13736.367,10.000,-68.894},
				{68567.832,13612.671,10.000,-68.571},
				{69922.341,13477.501,10.000,-68.154},
				{71262.758,13330.857,10.000,-67.648},
				{72587.938,13172.739,10.000,-67.056},
				{73896.733,13003.148,10.000,-66.382},
				{75187.994,12822.082,10.000,-65.632},
				{76460.575,12629.543,10.000,-64.810},
				{77713.329,12425.530,10.000,-63.924},
				{78945.108,12210.043,10.000,-62.978},
				{80154.764,11983.082,10.000,-61.982},
				{81341.150,11744.648,10.000,-60.942},
				{82503.120,11494.739,10.000,-59.867},
				{83639.525,11233.357,10.000,-58.767},
				{84749.218,10960.501,10.000,-57.651},
				{85831.051,10676.172,10.000,-56.528},
				{86884.326,10389.326,10.000,-55.409},
				{87908.916,10102.481,10.000,-54.300},
				{88904.822,9815.635,10.000,-53.210},
				{89872.044,9528.790,10.000,-52.147},
				{90810.580,9241.945,10.000,-51.116},
				{91720.432,8955.099,10.000,-50.123},
				{92601.600,8668.254,10.000,-49.173},
				{93454.083,8381.408,10.000,-48.270},
				{94277.882,8094.563,10.000,-47.417},
				{95072.996,7807.717,10.000,-46.617},
				{95839.425,7520.872,10.000,-45.870},
				{96577.170,7234.027,10.000,-45.178},
				{97286.231,6947.181,10.000,-44.540},
				{97966.606,6660.336,10.000,-43.956},
				{98618.298,6373.490,10.000,-43.425},
				{99241.304,6086.645,10.000,-42.945},
				{99835.627,5799.800,10.000,-42.514},
				{100401.264,5512.954,10.000,-42.130},
				{100938.218,5226.109,10.000,-41.791},
				{101446.486,4939.263,10.000,-41.493},
				{101926.070,4652.418,10.000,-41.234},
				{102376.970,4365.572,10.000,-41.011},
				{102799.185,4078.727,10.000,-40.820},
				{103192.715,3791.882,10.000,-40.658},
				{103557.561,3505.036,10.000,-40.523},
				{103894.170,3227.149,10.000,-40.412},
				{104203.564,2960.736,10.000,-40.320},
				{104486.891,2705.796,10.000,-40.246},
				{104745.297,2462.330,10.000,-40.186},
				{104979.931,2230.338,10.000,-40.139},
				{105191.939,2009.820,10.000,-40.102},
				{105382.468,1800.776,10.000,-40.074},
				{105552.667,1603.205,10.000,-40.052},
				{105703.683,1417.108,10.000,-40.036},
				{105836.663,1242.485,10.000,-40.025},
				{105952.754,1079.336,10.000,-40.016},
				{106053.104,927.661,10.000,-40.010},
				{106138.860,787.460,10.000,-40.006},
				{106211.169,658.732,10.000,-40.004},
				{106271.180,541.478,10.000,-40.002},
				{106320.039,435.698,10.000,-40.001},
				{106358.893,341.392,10.000,-40.001},
				{106388.891,258.560,10.000,-40.000},
				{106411.179,187.201,10.000,-40.000},
				{106426.905,127.316,10.000,-40.000},
				{106437.216,78.905,10.000,-40.000},
				{106443.260,41.968,10.000,-40.000},
				{106446.183,16.505,10.000,-40.000},
				{106447.134,2.516,10.000,-40.000},
				{106447.260,0.000,10.000,-40.000},
				{106447.260,0.000,10.000,-40.000}		};

}