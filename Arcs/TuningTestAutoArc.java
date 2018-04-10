package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class TuningTestAutoArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,13.08,0.00)
	// (5.63,18.08,89.99)
	// (5.63,28.08,89.99)
	
    public TuningTestAutoArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public TuningTestAutoArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{11.900,237.991,10.000,0.000},
				{47.598,475.983,10.000,0.000},
				{107.096,713.974,10.000,0.000},
				{190.393,951.965,10.000,0.000},
				{297.489,1189.956,10.000,0.000},
				{428.384,1427.948,10.000,0.000},
				{583.079,1665.939,10.000,0.000},
				{761.572,1903.930,10.000,0.000},
				{963.865,2141.922,10.000,0.010},
				{1189.956,2379.913,10.000,0.010},
				{1439.847,2617.904,10.000,0.010},
				{1713.537,2855.895,10.000,0.020},
				{2011.026,3093.887,10.000,0.030},
				{2332.315,3331.878,10.000,0.040},
				{2677.402,3569.869,10.000,0.050},
				{3046.288,3807.861,10.000,0.060},
				{3438.974,4045.852,10.000,0.080},
				{3855.459,4283.843,10.000,0.100},
				{4295.743,4521.834,10.000,0.130},
				{4759.826,4759.826,10.000,0.150},
				{5247.708,4997.817,10.000,0.190},
				{5759.389,5235.808,10.000,0.220},
				{6294.869,5473.800,10.000,0.270},
				{6854.149,5711.791,10.000,0.320},
				{7437.228,5949.782,10.000,0.370},
				{8044.105,6187.773,10.000,0.430},
				{8674.782,6425.765,10.000,0.500},
				{9329.258,6663.756,10.000,0.580},
				{10007.534,6901.747,10.000,0.670},
				{10709.608,7139.739,10.000,0.760},
				{11435.481,7377.730,10.000,0.870},
				{12185.154,7615.721,10.000,0.980},
				{12958.625,7853.712,10.000,1.110},
				{13755.896,8091.704,10.000,1.250},
				{14576.966,8329.695,10.000,1.410},
				{15421.835,8567.686,10.000,1.570},
				{16290.503,8805.678,10.000,1.760},
				{17182.971,9043.669,10.000,1.950},
				{18099.237,9281.660,10.000,2.170},
				{19039.303,9519.651,10.000,2.400},
				{20003.167,9757.643,10.000,2.660},
				{20990.831,9995.634,10.000,2.930},
				{22002.294,10233.625,10.000,3.230},
				{23037.556,10471.617,10.000,3.550},
				{24096.618,10709.608,10.000,3.890},
				{25179.478,10947.599,10.000,4.260},
				{26286.137,11185.590,10.000,4.670},
				{27416.596,11423.582,10.000,5.100},
				{28570.854,11661.573,10.000,5.570},
				{29748.911,11899.564,10.000,6.070},
				{30950.767,12137.556,10.000,6.620},
				{32176.422,12375.547,10.000,7.200},
				{33425.876,12613.538,10.000,7.830},
				{34699.129,12851.529,10.000,8.510},
				{35996.182,13089.521,10.000,9.250},
				{37317.033,13327.512,10.000,10.040},
				{38661.684,13565.503,10.000,10.890},
				{40030.134,13803.494,10.000,11.810},
				{41422.383,14041.486,10.000,12.810},
				{42838.431,14279.477,10.000,13.880},
				{44278.278,14517.468,10.000,15.040},
				{45741.925,14755.460,10.000,16.290},
				{47229.370,14993.451,10.000,17.640},
				{48740.615,15231.442,10.000,19.090},
				{50275.659,15469.433,10.000,20.660},
				{51834.502,15707.425,10.000,22.350},
				{53417.144,15945.416,10.000,24.160},
				{55023.585,16183.407,10.000,26.110},
				{56653.825,16421.399,10.000,28.190},
				{58307.865,16659.390,10.000,30.400},
				{59985.703,16897.381,10.000,32.750},
				{61687.341,17135.372,10.000,35.220},
				{63412.778,17373.364,10.000,37.820},
				{65162.014,17611.355,10.000,40.510},
				{66935.049,17849.346,10.000,43.290},
				{68731.883,18087.338,10.000,46.130},
				{70552.516,18325.329,10.000,48.990},
				{72396.949,18563.320,10.000,51.860},
				{74265.180,18801.311,10.000,54.700},
				{76157.211,19039.303,10.000,57.480},
				{78060.508,19026.633,10.000,60.160},
				{79951.272,18788.642,10.000,62.690},
				{81818.236,18550.651,10.000,65.050},
				{83661.402,18312.660,10.000,67.240},
				{85480.768,18074.668,10.000,69.260},
				{87276.335,17836.677,10.000,71.120},
				{89048.104,17598.686,10.000,72.820},
				{90796.073,17360.695,10.000,74.380},
				{92520.242,17122.703,10.000,75.810},
				{94220.613,16884.712,10.000,77.120},
				{95897.185,16646.721,10.000,78.310},
				{97549.957,16408.729,10.000,79.400},
				{99178.931,16170.738,10.000,80.390},
				{100784.105,15932.747,10.000,81.300},
				{102365.480,15694.756,10.000,82.120},
				{103923.056,15456.764,10.000,82.880},
				{105456.833,15218.773,10.000,83.570},
				{106966.811,14980.782,10.000,84.200},
				{108452.989,14742.790,10.000,84.770},
				{109915.369,14504.799,10.000,85.290},
				{111353.949,14266.808,10.000,85.770},
				{112768.730,14028.817,10.000,86.200},
				{114159.712,13790.825,10.000,86.600},
				{115526.895,13552.834,10.000,86.960},
				{116870.279,13314.843,10.000,87.280},
				{118189.864,13076.851,10.000,87.580},
				{119485.649,12838.860,10.000,87.850},
				{120757.636,12600.869,10.000,88.090},
				{122005.823,12362.878,10.000,88.310},
				{123230.211,12124.886,10.000,88.510},
				{124430.801,11886.895,10.000,88.690},
				{125607.590,11648.904,10.000,88.850},
				{126760.581,11410.912,10.000,89.000},
				{127889.773,11172.921,10.000,89.130},
				{128995.165,10934.930,10.000,89.240},
				{130076.759,10696.939,10.000,89.340},
				{131134.553,10458.947,10.000,89.440},
				{132168.548,10220.956,10.000,89.520},
				{133178.744,9982.965,10.000,89.590},
				{134165.141,9744.973,10.000,89.650},
				{135127.739,9506.982,10.000,89.710},
				{136066.538,9268.991,10.000,89.760},
				{136981.537,9031.000,10.000,89.800},
				{137872.738,8793.008,10.000,89.840},
				{138740.139,8555.017,10.000,89.870},
				{139583.741,8317.026,10.000,89.890},
				{140403.544,8079.034,10.000,89.920},
				{141199.548,7841.043,10.000,89.930},
				{141971.753,7603.052,10.000,89.950},
				{142720.158,7365.061,10.000,89.960},
				{143444.765,7127.069,10.000,89.970},
				{144145.572,6889.078,10.000,89.980},
				{144822.580,6651.087,10.000,89.990},
				{145475.789,6413.095,10.000,89.990},
				{146105.199,6175.104,10.000,90.000},
				{146710.810,5937.113,10.000,90.000},
				{147292.622,5699.122,10.000,90.000},
				{147850.635,5461.130,10.000,90.000},
				{148384.848,5223.139,10.000,90.000},
				{148895.262,4985.148,10.000,90.000},
				{149381.878,4747.156,10.000,90.000},
				{149844.694,4509.165,10.000,90.000},
				{150283.711,4271.174,10.000,90.000},
				{150698.928,4033.183,10.000,90.000},
				{151090.347,3795.191,10.000,90.000},
				{151457.967,3557.200,10.000,90.000},
				{151801.787,3319.209,10.000,90.000},
				{152121.808,3081.217,10.000,90.000},
				{152418.031,2843.226,10.000,90.000},
				{152690.454,2605.235,10.000,90.000},
				{152939.078,2367.244,10.000,90.000},
				{153163.902,2129.252,10.000,89.990},
				{153364.928,1891.261,10.000,89.990},
				{153542.155,1653.270,10.000,89.990},
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
				{889.712,1617.658,10.000,0.010},
				{1061.588,1819.866,10.000,0.010},
				{1254.280,2033.967,10.000,0.010},
				{1468.976,2259.964,10.000,0.010},
				{1706.867,2497.855,10.000,0.020},
				{1968.547,2735.746,10.000,0.030},
				{2254.017,2973.637,10.000,0.030},
				{2563.275,3211.527,10.000,0.050},
				{2896.322,3449.418,10.000,0.060},
				{3253.158,3687.309,10.000,0.070},
				{3633.784,3925.200,10.000,0.090},
				{4038.198,4163.091,10.000,0.110},
				{4466.402,4400.982,10.000,0.140},
				{4918.395,4638.873,10.000,0.160},
				{5394.177,4876.764,10.000,0.200},
				{5893.748,5114.655,10.000,0.230},
				{6417.108,5352.546,10.000,0.280},
				{6964.257,5590.437,10.000,0.330},
				{7535.195,5828.328,10.000,0.380},
				{8129.922,6066.219,10.000,0.440},
				{8748.439,6304.109,10.000,0.510},
				{9390.744,6542.000,10.000,0.590},
				{10056.839,6779.891,10.000,0.670},
				{10746.723,7017.782,10.000,0.770},
				{11460.395,7255.673,10.000,0.870},
				{12197.857,7493.564,10.000,0.990},
				{12959.108,7731.455,10.000,1.110},
				{13744.148,7969.346,10.000,1.250},
				{14552.977,8207.237,10.000,1.400},
				{15385.596,8445.128,10.000,1.570},
				{16242.003,8683.019,10.000,1.740},
				{17122.199,8920.910,10.000,1.940},
				{18026.185,9158.801,10.000,2.150},
				{18953.959,9396.692,10.000,2.380},
				{19905.523,9634.582,10.000,2.630},
				{20880.876,9872.473,10.000,2.900},
				{21880.018,10110.364,10.000,3.190},
				{22902.949,10348.255,10.000,3.500},
				{23949.669,10586.146,10.000,3.840},
				{25020.178,10824.037,10.000,4.210},
				{26114.476,11061.928,10.000,4.600},
				{27232.564,11299.819,10.000,5.030},
				{28374.440,11537.710,10.000,5.490},
				{29540.106,11775.601,10.000,5.980},
				{30729.560,12013.492,10.000,6.510},
				{31942.804,12251.383,10.000,7.090},
				{33179.837,12489.274,10.000,7.710},
				{34440.659,12727.164,10.000,8.370},
				{35725.270,12965.055,10.000,9.090},
				{37033.670,13202.946,10.000,9.860},
				{38365.859,13440.837,10.000,10.700},
				{39721.837,13678.728,10.000,11.600},
				{41101.604,13916.619,10.000,12.570},
				{42505.161,14154.510,10.000,13.620},
				{43932.506,14392.401,10.000,14.750},
				{45383.641,14630.292,10.000,15.970},
				{46858.565,14868.183,10.000,17.290},
				{48357.278,15106.074,10.000,18.710},
				{49879.780,15343.965,10.000,20.250},
				{51426.071,15581.856,10.000,21.890},
				{52996.151,15819.746,10.000,23.670},
				{54590.020,16057.637,10.000,25.570},
				{56207.678,16295.528,10.000,27.610},
				{57849.125,16533.419,10.000,29.780},
				{59514.362,16771.310,10.000,32.080},
				{61203.388,17009.201,10.000,34.510},
				{62916.202,17247.092,10.000,37.060},
				{64652.211,17473.088,10.000,39.720},
				{66410.225,17687.190,10.000,42.470},
				{68189.055,17889.398,10.000,45.270},
				{69987.510,18079.710,10.000,48.110},
				{71804.402,18258.128,10.000,50.950},
				{73638.541,18424.652,10.000,53.760},
				{75488.738,18579.281,10.000,56.510},
				{77353.802,18722.016,10.000,59.180},
				{79232.546,18852.856,10.000,61.750},
				{81123.779,18971.801,10.000,64.190},
				{83026.311,19078.852,10.000,66.500},
				{84938.954,19174.008,10.000,68.670},
				{86860.518,19257.270,10.000,70.700},
				{88789.814,19328.638,10.000,72.580},
				{90725.651,19388.110,10.000,74.320},
				{92666.841,19435.689,10.000,75.930},
				{94612.194,19471.372,10.000,77.400},
				{96560.521,19495.161,10.000,78.750},
				{98510.632,19507.056,10.000,79.990},
				{100461.238,19505.072,10.000,81.120},
				{102411.051,19491.193,10.000,82.150},
				{104358.882,19465.419,10.000,83.080},
				{106303.540,19427.752,10.000,83.930},
				{108243.838,19378.189,10.000,84.690},
				{110178.584,19316.732,10.000,85.380},
				{112106.589,19243.381,10.000,86.000},
				{114026.665,19158.135,10.000,86.560},
				{115937.621,19060.994,10.000,87.060},
				{117838.269,18951.959,10.000,87.500},
				{119727.419,18831.029,10.000,87.890},
				{121603.880,18698.205,10.000,88.240},
				{123466.465,18553.486,10.000,88.550},
				{125313.983,18396.873,10.000,88.810},
				{127145.245,18228.365,10.000,89.040},
				{128959.061,18047.963,10.000,89.240},
				{130754.243,17855.666,10.000,89.400},
				{132529.600,17651.474,10.000,89.540},
				{134283.943,17435.388,10.000,89.660},
				{136016.082,17207.408,10.000,89.760},
				{137724.929,16969.517,10.000,89.830},
				{139409.986,16731.626,10.000,89.890},
				{141071.254,16493.735,10.000,89.930},
				{142708.733,16255.844,10.000,89.960},
				{144322.423,16017.953,10.000,89.980},
				{145912.323,15780.062,10.000,90.000},
				{147478.435,15542.171,10.000,90.000},
				{149020.758,15304.280,10.000,90.000},
				{150539.291,15066.389,10.000,90.000},
				{152034.035,14828.498,10.000,90.000},
				{153504.991,14590.607,10.000,89.990},
				{154952.157,14352.717,10.000,89.990},
				{156375.534,14114.826,10.000,89.990},
				{157775.122,13876.935,10.000,89.990},
				{159150.921,13639.044,10.000,89.990},
				{160502.931,13401.153,10.000,89.990},
				{161831.152,13163.262,10.000,89.990},
				{163135.583,12925.371,10.000,89.990},
				{164416.226,12687.480,10.000,89.990},
				{165673.079,12449.589,10.000,89.990},
				{166906.144,12211.698,10.000,89.990},
				{168115.419,11973.807,10.000,89.990},
				{169300.905,11735.916,10.000,89.990},
				{170462.602,11498.025,10.000,89.990},
				{171600.510,11260.135,10.000,89.990},
				{172714.629,11022.244,10.000,89.990},
				{173804.959,10784.353,10.000,89.990},
				{174871.500,10546.462,10.000,89.990},
				{175914.251,10308.571,10.000,89.990},
				{176933.214,10070.680,10.000,89.990},
				{177928.387,9832.789,10.000,89.990},
				{178899.771,9594.898,10.000,89.990},
				{179847.367,9357.007,10.000,89.990},
				{180771.173,9119.116,10.000,89.990},
				{181671.190,8881.225,10.000,89.990},
				{182547.418,8643.334,10.000,89.990},
				{183399.857,8405.443,10.000,89.990},
				{184228.507,8167.552,10.000,89.990},
				{185033.367,7929.662,10.000,89.990},
				{185814.439,7691.771,10.000,89.990},
				{186571.721,7453.880,10.000,90.000},
				{187305.215,7215.989,10.000,90.000},
				{188014.919,6978.098,10.000,90.000},
				{188700.834,6740.207,10.000,90.000},
				{189362.961,6502.316,10.000,90.000},
				{190001.298,6264.425,10.000,90.000},
				{190615.846,6026.534,10.000,90.000},
				{191206.605,5788.643,10.000,90.000},
				{191773.574,5550.752,10.000,90.000},
				{192316.755,5312.861,10.000,90.000},
				{192836.147,5074.970,10.000,90.000},
				{193331.749,4837.080,10.000,90.000},
				{193803.562,4599.189,10.000,90.000},
				{194251.587,4361.298,10.000,90.000},
				{194675.822,4123.407,10.000,90.000},
				{195076.268,3885.516,10.000,90.000},
				{195452.925,3647.625,10.000,90.000},
				{195805.793,3409.734,10.000,90.000},
				{196134.872,3171.843,10.000,90.000},
				{196440.162,2933.952,10.000,90.000},
				{196721.662,2696.061,10.000,90.000},
				{196979.374,2458.170,10.000,90.000},
				{197213.396,2222.264,10.000,90.000},
				{197424.421,1998.251,10.000,90.000},
				{197613.641,1786.134,10.000,90.000},
				{197782.243,1585.911,10.000,90.000},
				{197931.418,1397.582,10.000,90.000},
				{198062.354,1221.148,10.000,90.000},
				{198176.242,1056.609,10.000,90.000},
				{198274.271,903.964,10.000,90.000},
				{198357.629,763.214,10.000,90.000},
				{198427.508,634.358,10.000,90.000},
				{198485.096,517.397,10.000,90.000},
				{198531.582,412.330,10.000,90.000},
				{198568.156,319.158,10.000,90.000},
				{198596.008,237.880,10.000,90.000},
				{198616.327,168.497,10.000,90.000},
				{198630.303,111.009,10.000,90.000},
				{198639.124,65.415,10.000,90.000},
				{198643.980,31.715,10.000,90.000},
				{198646.061,9.910,10.000,90.000},
				{198646.557,0.000,10.000,90.000},
				{198646.557,0.000,10.000,90.000}		};

}