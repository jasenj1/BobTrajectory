package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class LeftScaleToSecondSwitchCubeArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (24.13,17.40,-15.00)
	// (19.33,14.30,55.00)
	
    public LeftScaleToSecondSwitchCubeArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftScaleToSecondSwitchCubeArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.547,10.931,10.000,-15.000},
				{2.733,32.792,10.000,-15.000},
				{7.652,65.584,10.000,-15.000},
				{16.396,109.307,10.000,-15.000},
				{30.059,163.961,10.000,-15.000},
				{49.735,229.545,10.000,-15.000},
				{76.515,306.060,10.000,-15.000},
				{111.493,393.506,10.000,-15.000},
				{155.763,491.882,10.000,-15.000},
				{210.416,601.190,10.000,-14.999},
				{276.547,721.428,10.000,-14.999},
				{355.248,852.596,10.000,-14.998},
				{447.613,994.696,10.000,-14.997},
				{554.734,1147.726,10.000,-14.996},
				{677.158,1300.756,10.000,-14.994},
				{814.885,1453.786,10.000,-14.991},
				{967.915,1606.816,10.000,-14.987},
				{1136.248,1759.846,10.000,-14.982},
				{1319.884,1912.876,10.000,-14.975},
				{1518.824,2065.906,10.000,-14.968},
				{1733.066,2218.936,10.000,-14.958},
				{1962.611,2371.966,10.000,-14.946},
				{2207.459,2524.996,10.000,-14.932},
				{2467.610,2678.026,10.000,-14.915},
				{2743.064,2831.057,10.000,-14.895},
				{3033.821,2984.087,10.000,-14.872},
				{3339.882,3137.117,10.000,-14.845},
				{3661.245,3290.147,10.000,-14.814},
				{3997.911,3443.177,10.000,-14.779},
				{4349.880,3596.207,10.000,-14.739},
				{4717.152,3749.237,10.000,-14.694},
				{5099.727,3902.267,10.000,-14.643},
				{5497.606,4055.297,10.000,-14.586},
				{5910.787,4208.327,10.000,-14.523},
				{6339.271,4361.357,10.000,-14.452},
				{6783.058,4514.387,10.000,-14.374},
				{7242.149,4667.418,10.000,-14.288},
				{7716.542,4820.448,10.000,-14.193},
				{8206.238,4973.478,10.000,-14.089},
				{8711.237,5126.508,10.000,-13.975},
				{9231.540,5279.538,10.000,-13.850},
				{9767.145,5432.568,10.000,-13.715},
				{10318.053,5585.598,10.000,-13.567},
				{10884.265,5738.628,10.000,-13.407},
				{11465.779,5891.658,10.000,-13.234},
				{12062.596,6044.688,10.000,-13.046},
				{12674.717,6197.718,10.000,-12.844},
				{13302.140,6350.748,10.000,-12.625},
				{13944.866,6503.778,10.000,-12.389},
				{14602.896,6656.809,10.000,-12.136},
				{15276.228,6809.839,10.000,-11.863},
				{15964.863,6962.869,10.000,-11.571},
				{16668.802,7115.899,10.000,-11.256},
				{17388.043,7268.929,10.000,-10.920},
				{18122.587,7421.959,10.000,-10.558},
				{18872.435,7574.989,10.000,-10.172},
				{19637.585,7728.019,10.000,-9.758},
				{20418.039,7881.049,10.000,-9.314},
				{21213.795,8034.079,10.000,-8.841},
				{22024.855,8187.109,10.000,-8.334},
				{22851.217,8340.139,10.000,-7.792},
				{23692.882,8493.170,10.000,-7.213},
				{24549.851,8646.200,10.000,-6.595},
				{25422.122,8799.230,10.000,-5.935},
				{26309.697,8952.260,10.000,-5.229},
				{27212.574,9105.290,10.000,-4.476},
				{28130.755,9258.320,10.000,-3.673},
				{29064.238,9411.350,10.000,-2.815},
				{30013.025,9564.380,10.000,-1.901},
				{30977.114,9717.410,10.000,-0.926},
				{31956.507,9870.440,10.000,0.113},
				{32951.202,10023.470,10.000,1.220},
				{33961.201,10176.500,10.000,2.398},
				{34986.502,10329.531,10.000,3.649},
				{36027.107,10482.561,10.000,4.978},
				{37083.015,10635.591,10.000,6.387},
				{38154.225,10788.621,10.000,7.877},
				{39240.739,10941.651,10.000,9.451},
				{40342.555,11094.681,10.000,11.108},
				{41459.675,11247.711,10.000,12.848},
				{42592.098,11400.741,10.000,14.669},
				{43739.823,11553.771,10.000,16.565},
				{44902.852,11706.801,10.000,18.532},
				{46081.183,11859.831,10.000,20.562},
				{47274.818,12012.861,10.000,22.645},
				{48483.209,12154.961,10.000,24.769},
				{49705.264,12286.129,10.000,26.919},
				{50939.889,12406.367,10.000,29.079},
				{52185.991,12515.675,10.000,31.231},
				{53442.477,12614.051,10.000,33.360},
				{54708.254,12701.497,10.000,35.450},
				{55982.230,12778.012,10.000,37.485},
				{57263.310,12843.596,10.000,39.454},
				{58550.402,12898.250,10.000,41.346},
				{59842.414,12941.973,10.000,43.152},
				{61138.250,12974.765,10.000,44.865},
				{62436.820,12996.626,10.000,46.482},
				{63736.684,13000.656,10.000,47.999},
				{65035.858,12982.824,10.000,49.415},
				{66332.702,12954.061,10.000,50.731},
				{67626.124,12914.368,10.000,51.947},
				{68915.029,12863.744,10.000,53.068},
				{70198.326,12802.189,10.000,54.096},
				{71474.920,12729.703,10.000,55.036},
				{72743.720,12646.287,10.000,55.891},
				{74003.631,12551.940,10.000,56.666},
				{75253.561,12446.662,10.000,57.366},
				{76492.417,12330.454,10.000,57.993},
				{77719.106,12203.314,10.000,58.553},
				{78932.534,12065.245,10.000,59.049},
				{80131.608,11916.244,10.000,59.486},
				{81315.581,11763.214,10.000,59.868},
				{82484.251,11610.184,10.000,60.198},
				{83637.618,11457.154,10.000,60.480},
				{84775.681,11304.124,10.000,60.717},
				{85898.442,11151.093,10.000,60.913},
				{87005.900,10998.063,10.000,61.071},
				{88098.055,10845.033,10.000,61.192},
				{89174.907,10692.003,10.000,61.281},
				{90236.456,10538.973,10.000,61.338},
				{91282.701,10385.943,10.000,61.368},
				{92313.644,10232.913,10.000,61.370},
				{93329.284,10079.883,10.000,61.349},
				{94329.621,9926.853,10.000,61.304},
				{95314.655,9773.823,10.000,61.240},
				{96284.385,9620.793,10.000,61.156},
				{97238.813,9467.763,10.000,61.055},
				{98177.938,9314.733,10.000,60.938},
				{99101.760,9161.702,10.000,60.807},
				{100010.278,9008.672,10.000,60.664},
				{100903.494,8855.642,10.000,60.509},
				{101781.407,8702.612,10.000,60.345},
				{102644.017,8549.582,10.000,60.172},
				{103491.323,8396.552,10.000,59.991},
				{104323.327,8243.522,10.000,59.805},
				{105140.028,8090.492,10.000,59.614},
				{105941.425,7937.462,10.000,59.419},
				{106727.520,7784.432,10.000,59.222},
				{107498.312,7631.402,10.000,59.023},
				{108253.800,7478.372,10.000,58.823},
				{108993.986,7325.341,10.000,58.624},
				{109718.869,7172.311,10.000,58.426},
				{110428.448,7019.281,10.000,58.229},
				{111122.725,6866.251,10.000,58.036},
				{111801.698,6713.221,10.000,57.846},
				{112465.369,6560.191,10.000,57.661},
				{113113.737,6407.161,10.000,57.480},
				{113746.801,6254.131,10.000,57.304},
				{114364.563,6101.101,10.000,57.134},
				{114967.021,5948.071,10.000,56.971},
				{115554.177,5795.041,10.000,56.814},
				{116126.030,5642.011,10.000,56.663},
				{116682.579,5488.980,10.000,56.520},
				{117223.826,5335.950,10.000,56.384},
				{117749.769,5182.920,10.000,56.255},
				{118260.410,5029.890,10.000,56.133},
				{118755.747,4876.860,10.000,56.019},
				{119235.782,4723.830,10.000,55.913},
				{119700.513,4570.800,10.000,55.814},
				{120149.942,4417.770,10.000,55.722},
				{120584.067,4264.740,10.000,55.637},
				{121002.890,4111.710,10.000,55.559},
				{121406.409,3958.680,10.000,55.488},
				{121794.626,3805.650,10.000,55.423},
				{122167.539,3652.619,10.000,55.365},
				{122525.149,3499.589,10.000,55.312},
				{122867.457,3346.559,10.000,55.265},
				{123194.461,3193.529,10.000,55.223},
				{123506.163,3040.499,10.000,55.186},
				{123802.561,2887.469,10.000,55.154},
				{124083.657,2734.439,10.000,55.126},
				{124349.449,2581.409,10.000,55.102},
				{124599.938,2428.379,10.000,55.082},
				{124835.125,2275.349,10.000,55.065},
				{125055.008,2122.319,10.000,55.050},
				{125259.588,1969.289,10.000,55.038},
				{125448.866,1816.258,10.000,55.029},
				{125622.840,1663.228,10.000,55.021},
				{125781.511,1510.198,10.000,55.015},
				{125924.880,1357.168,10.000,55.011},
				{126052.945,1204.138,10.000,55.007},
				{126165.707,1051.108,10.000,55.005},
				{126263.512,904.979,10.000,55.003},
				{126347.250,769.781,10.000,55.002},
				{126418.015,645.514,10.000,55.001},
				{126476.899,532.177,10.000,55.001},
				{126524.997,429.771,10.000,55.000},
				{126563.400,338.296,10.000,55.000},
				{126593.202,257.751,10.000,55.000},
				{126615.497,188.138,10.000,55.000},
				{126631.376,129.455,10.000,55.000},
				{126641.934,81.702,10.000,55.000},
				{126648.263,44.881,10.000,55.000},
				{126651.457,18.990,10.000,55.000},
				{126652.608,4.029,10.000,55.000},
				{126652.809,0.000,10.000,55.000},
				{126652.809,0.000,10.000,55.000}		};

}