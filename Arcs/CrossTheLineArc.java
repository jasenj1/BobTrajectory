package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CrossTheLineArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (10.00,0.00,0.00)
	
    public CrossTheLineArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CrossTheLineArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.595,11.895,10.000,0.000},
				{2.974,35.684,10.000,0.000},
				{8.326,71.367,10.000,0.000},
				{17.842,118.945,10.000,0.000},
				{32.710,178.418,10.000,0.000},
				{54.120,249.785,10.000,0.000},
				{83.262,333.047,10.000,0.000},
				{121.324,428.204,10.000,0.000},
				{169.497,535.255,10.000,0.000},
				{228.970,654.200,10.000,0.000},
				{300.932,785.040,10.000,0.000},
				{386.573,927.775,10.000,0.000},
				{487.082,1082.404,10.000,0.000},
				{603.648,1248.927,10.000,0.000},
				{737.462,1427.346,10.000,0.000},
				{889.712,1617.658,10.000,0.000},
				{1061.588,1819.866,10.000,0.000},
				{1254.280,2033.967,10.000,0.000},
				{1468.976,2259.964,10.000,0.000},
				{1706.867,2497.855,10.000,0.000},
				{1968.547,2735.746,10.000,0.000},
				{2254.016,2973.637,10.000,0.000},
				{2563.275,3211.527,10.000,0.000},
				{2896.322,3449.418,10.000,0.000},
				{3253.158,3687.309,10.000,0.000},
				{3633.784,3925.200,10.000,0.000},
				{4038.198,4163.091,10.000,0.000},
				{4466.402,4400.982,10.000,0.000},
				{4918.395,4638.873,10.000,0.000},
				{5394.177,4876.764,10.000,0.000},
				{5893.748,5114.655,10.000,0.000},
				{6417.108,5352.546,10.000,0.000},
				{6964.257,5590.437,10.000,0.000},
				{7535.195,5828.328,10.000,0.000},
				{8129.922,6066.219,10.000,0.000},
				{8748.439,6304.109,10.000,0.000},
				{9390.744,6542.000,10.000,0.000},
				{10056.839,6779.891,10.000,0.000},
				{10746.722,7017.782,10.000,0.000},
				{11460.395,7255.673,10.000,0.000},
				{12197.857,7493.564,10.000,0.000},
				{12959.108,7731.455,10.000,0.000},
				{13744.148,7969.346,10.000,0.000},
				{14552.977,8207.237,10.000,0.000},
				{15385.595,8445.128,10.000,0.000},
				{16242.003,8683.019,10.000,0.000},
				{17122.199,8920.910,10.000,0.000},
				{18026.185,9158.801,10.000,0.000},
				{18953.959,9396.691,10.000,0.000},
				{19905.523,9634.582,10.000,0.000},
				{20880.876,9872.473,10.000,0.000},
				{21880.018,10110.364,10.000,0.000},
				{22902.949,10348.255,10.000,0.000},
				{23949.669,10586.146,10.000,0.000},
				{25020.178,10824.037,10.000,0.000},
				{26114.476,11061.928,10.000,0.000},
				{27232.563,11299.819,10.000,0.000},
				{28374.440,11537.710,10.000,0.000},
				{29540.105,11775.601,10.000,0.000},
				{30729.560,12013.492,10.000,0.000},
				{31942.804,12251.383,10.000,0.000},
				{33179.837,12489.273,10.000,0.000},
				{34440.658,12727.164,10.000,0.000},
				{35725.269,12965.055,10.000,0.000},
				{37033.669,13202.946,10.000,0.000},
				{38365.859,13440.837,10.000,0.000},
				{39721.837,13678.728,10.000,0.000},
				{41101.604,13916.619,10.000,0.000},
				{42505.161,14154.510,10.000,0.000},
				{43932.506,14392.401,10.000,0.000},
				{45383.641,14630.292,10.000,0.000},
				{46858.565,14868.183,10.000,0.000},
				{48357.277,15106.074,10.000,0.000},
				{49879.779,15343.965,10.000,0.000},
				{51426.070,15581.855,10.000,0.000},
				{52996.150,15819.746,10.000,0.000},
				{54590.020,16057.637,10.000,0.000},
				{56207.678,16295.528,10.000,0.000},
				{57849.125,16533.419,10.000,0.000},
				{59514.362,16771.310,10.000,0.000},
				{61203.387,17009.201,10.000,0.000},
				{62916.202,17247.092,10.000,0.000},
				{64652.211,17473.088,10.000,0.000},
				{66410.225,17687.190,10.000,0.000},
				{68189.054,17889.397,10.000,0.000},
				{69987.510,18079.710,10.000,0.000},
				{71804.402,18258.128,10.000,0.000},
				{73638.541,18424.652,10.000,0.000},
				{75488.737,18579.281,10.000,0.000},
				{77353.802,18722.016,10.000,0.000},
				{79232.546,18852.856,10.000,0.000},
				{81123.779,18971.801,10.000,0.000},
				{83026.311,19078.852,10.000,0.000},
				{84938.954,19174.008,10.000,0.000},
				{86860.518,19257.270,10.000,0.000},
				{88789.814,19328.638,10.000,0.000},
				{90725.651,19388.110,10.000,0.000},
				{92666.841,19435.688,10.000,0.000},
				{94612.194,19471.372,10.000,0.000},
				{96560.521,19495.161,10.000,0.000},
				{98510.631,19507.056,10.000,0.000},
				{100461.238,19505.071,10.000,0.000},
				{102411.051,19491.193,10.000,0.000},
				{104358.882,19465.419,10.000,0.000},
				{106303.540,19427.752,10.000,0.000},
				{108243.837,19378.189,10.000,0.000},
				{110178.583,19316.732,10.000,0.000},
				{112106.589,19243.381,10.000,0.000},
				{114026.665,19158.135,10.000,0.000},
				{115937.621,19060.994,10.000,0.000},
				{117838.269,18951.959,10.000,0.000},
				{119727.418,18831.029,10.000,0.000},
				{121603.880,18698.205,10.000,0.000},
				{123466.464,18553.486,10.000,0.000},
				{125313.982,18396.873,10.000,0.000},
				{127145.244,18228.365,10.000,0.000},
				{128959.061,18047.963,10.000,0.000},
				{130754.242,17855.666,10.000,0.000},
				{132529.599,17651.474,10.000,0.000},
				{134283.942,17435.388,10.000,0.000},
				{136016.082,17207.407,10.000,0.000},
				{137724.928,16969.517,10.000,0.000},
				{139409.985,16731.626,10.000,0.000},
				{141071.253,16493.735,10.000,0.000},
				{142708.732,16255.844,10.000,0.000},
				{144322.422,16017.953,10.000,0.000},
				{145912.323,15780.062,10.000,0.000},
				{147478.434,15542.171,10.000,0.000},
				{149020.757,15304.280,10.000,0.000},
				{150539.290,15066.389,10.000,0.000},
				{152034.035,14828.498,10.000,0.000},
				{153504.990,14590.607,10.000,0.000},
				{154952.156,14352.716,10.000,0.000},
				{156375.533,14114.825,10.000,0.000},
				{157775.121,13876.935,10.000,0.000},
				{159150.920,13639.044,10.000,0.000},
				{160502.930,13401.153,10.000,0.000},
				{161831.151,13163.262,10.000,0.000},
				{163135.582,12925.371,10.000,0.000},
				{164416.225,12687.480,10.000,0.000},
				{165673.078,12449.589,10.000,0.000},
				{166906.143,12211.698,10.000,0.000},
				{168115.418,11973.807,10.000,0.000},
				{169300.904,11735.916,10.000,0.000},
				{170462.601,11498.025,10.000,0.000},
				{171600.509,11260.134,10.000,0.000},
				{172714.628,11022.243,10.000,0.000},
				{173804.958,10784.353,10.000,0.000},
				{174871.499,10546.462,10.000,0.000},
				{175914.250,10308.571,10.000,0.000},
				{176933.213,10070.680,10.000,0.000},
				{177928.386,9832.789,10.000,0.000},
				{178899.771,9594.898,10.000,0.000},
				{179847.366,9357.007,10.000,0.000},
				{180771.172,9119.116,10.000,0.000},
				{181671.189,8881.225,10.000,0.000},
				{182547.417,8643.334,10.000,0.000},
				{183399.856,8405.443,10.000,0.000},
				{184228.506,8167.552,10.000,0.000},
				{185033.366,7929.661,10.000,0.000},
				{185814.438,7691.771,10.000,0.000},
				{186571.720,7453.880,10.000,0.000},
				{187305.214,7215.989,10.000,0.000},
				{188014.918,6978.098,10.000,0.000},
				{188700.833,6740.207,10.000,0.000},
				{189362.960,6502.316,10.000,0.000},
				{190001.297,6264.425,10.000,0.000},
				{190615.845,6026.534,10.000,0.000},
				{191206.603,5788.643,10.000,0.000},
				{191773.573,5550.752,10.000,0.000},
				{192316.754,5312.861,10.000,0.000},
				{192836.145,5074.970,10.000,0.000},
				{193331.748,4837.079,10.000,0.000},
				{193803.561,4599.189,10.000,0.000},
				{194251.586,4361.298,10.000,0.000},
				{194675.821,4123.407,10.000,0.000},
				{195076.267,3885.516,10.000,0.000},
				{195452.924,3647.625,10.000,0.000},
				{195805.792,3409.734,10.000,0.000},
				{196134.871,3171.843,10.000,0.000},
				{196440.161,2933.952,10.000,0.000},
				{196721.661,2696.061,10.000,0.000},
				{196979.373,2458.170,10.000,0.000},
				{197213.394,2222.264,10.000,0.000},
				{197424.420,1998.251,10.000,0.000},
				{197613.639,1786.134,10.000,0.000},
				{197782.242,1585.911,10.000,0.000},
				{197931.416,1397.582,10.000,0.000},
				{198062.353,1221.148,10.000,0.000},
				{198176.241,1056.609,10.000,0.000},
				{198274.269,903.964,10.000,0.000},
				{198357.628,763.214,10.000,0.000},
				{198427.507,634.358,10.000,0.000},
				{198485.095,517.397,10.000,0.000},
				{198531.581,412.330,10.000,0.000},
				{198568.155,319.158,10.000,0.000},
				{198596.007,237.880,10.000,0.000},
				{198616.326,168.497,10.000,0.000},
				{198630.301,111.009,10.000,0.000},
				{198639.122,65.415,10.000,0.000},
				{198643.979,31.715,10.000,0.000},
				{198646.060,9.910,10.000,0.000},
				{198646.556,0.000,10.000,0.000},
				{198646.556,0.000,10.000,0.000}		};

}