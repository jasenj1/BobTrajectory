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
				{0.551,11.013,10.000,-5.000},
				{2.753,33.040,10.000,-5.000},
				{7.709,66.080,10.000,-5.000},
				{16.520,110.134,10.000,-5.000},
				{30.287,165.201,10.000,-5.000},
				{50.111,231.281,10.000,-5.000},
				{77.094,308.375,10.000,-5.000},
				{112.336,396.482,10.000,-5.000},
				{156.941,495.602,10.000,-5.001},
				{212.008,605.736,10.000,-5.002},
				{278.639,726.883,10.000,-5.003},
				{357.935,859.044,10.000,-5.004},
				{450.998,1002.218,10.000,-5.007},
				{558.929,1156.405,10.000,-5.010},
				{682.279,1310.592,10.000,-5.016},
				{821.048,1464.780,10.000,-5.023},
				{975.235,1618.967,10.000,-5.032},
				{1144.841,1773.154,10.000,-5.044},
				{1329.866,1927.342,10.000,-5.059},
				{1530.309,2081.529,10.000,-5.078},
				{1746.172,2235.716,10.000,-5.101},
				{1977.453,2389.904,10.000,-5.129},
				{2224.152,2544.091,10.000,-5.162},
				{2486.271,2698.278,10.000,-5.202},
				{2763.808,2852.466,10.000,-5.249},
				{3056.764,3006.653,10.000,-5.304},
				{3365.139,3160.840,10.000,-5.368},
				{3688.932,3315.028,10.000,-5.440},
				{4028.144,3469.215,10.000,-5.524},
				{4382.775,3623.402,10.000,-5.618},
				{4752.825,3777.590,10.000,-5.725},
				{5138.293,3931.777,10.000,-5.844},
				{5539.180,4085.964,10.000,-5.979},
				{5955.486,4240.152,10.000,-6.128},
				{6387.210,4394.339,10.000,-6.294},
				{6834.354,4548.526,10.000,-6.478},
				{7296.916,4702.714,10.000,-6.681},
				{7774.896,4856.901,10.000,-6.904},
				{8268.296,5011.088,10.000,-7.150},
				{8777.114,5165.276,10.000,-7.418},
				{9301.351,5319.463,10.000,-7.711},
				{9841.007,5473.650,10.000,-8.031},
				{10396.081,5627.838,10.000,-8.379},
				{10966.574,5782.025,10.000,-8.757},
				{11552.486,5936.212,10.000,-9.167},
				{12153.817,6090.400,10.000,-9.612},
				{12770.566,6244.587,10.000,-10.092},
				{13402.734,6398.774,10.000,-10.611},
				{14050.321,6552.962,10.000,-11.171},
				{14713.326,6707.149,10.000,-11.775},
				{15391.751,6861.336,10.000,-12.424},
				{16085.594,7015.524,10.000,-13.122},
				{16794.855,7169.711,10.000,-13.872},
				{17519.536,7323.898,10.000,-14.677},
				{18259.635,7478.086,10.000,-15.540},
				{19015.153,7632.273,10.000,-16.463},
				{19786.090,7786.460,10.000,-17.449},
				{20572.445,7940.648,10.000,-18.502},
				{21374.219,8094.835,10.000,-19.624},
				{22191.412,8249.022,10.000,-20.818},
				{23024.024,8403.210,10.000,-22.086},
				{23872.054,8557.397,10.000,-23.428},
				{24735.503,8711.584,10.000,-24.847},
				{25614.371,8865.772,10.000,-26.341},
				{26508.657,9019.959,10.000,-27.910},
				{27418.363,9174.146,10.000,-29.551},
				{28343.487,9328.334,10.000,-31.261},
				{29284.029,9482.521,10.000,-33.035},
				{30239.991,9636.708,10.000,-34.864},
				{31211.371,9790.896,10.000,-36.741},
				{32198.170,9945.083,10.000,-38.656},
				{33200.388,10099.270,10.000,-40.598},
				{34218.024,10253.458,10.000,-42.553},
				{35251.079,10407.645,10.000,-44.508},
				{36299.553,10561.832,10.000,-46.450},
				{37363.446,10716.020,10.000,-48.366},
				{38442.206,10859.194,10.000,-50.240},
				{39534.734,10991.354,10.000,-52.060},
				{40639.926,11112.501,10.000,-53.813},
				{41756.683,11222.635,10.000,-55.488},
				{42883.903,11321.756,10.000,-57.077},
				{44020.484,11409.863,10.000,-58.573},
				{45165.325,11486.956,10.000,-59.971},
				{46317.324,11553.037,10.000,-61.269},
				{47475.381,11608.104,10.000,-62.464},
				{48638.394,11652.157,10.000,-63.556},
				{49805.262,11685.197,10.000,-64.545},
				{50974.883,11707.224,10.000,-65.433},
				{52146.156,11718.237,10.000,-66.221},
				{53317.451,11707.653,10.000,-66.912},
				{54487.136,11686.056,10.000,-67.507},
				{55654.111,11653.445,10.000,-68.011},
				{56817.275,11609.821,10.000,-68.425},
				{57975.525,11555.184,10.000,-68.754},
				{59127.761,11489.533,10.000,-68.999},
				{60272.881,11412.869,10.000,-69.165},
				{61409.784,11325.191,10.000,-69.253},
				{62537.368,11226.500,10.000,-69.268},
				{63654.533,11116.795,10.000,-69.211},
				{64760.177,10996.078,10.000,-69.087},
				{65853.198,10864.347,10.000,-68.897},
				{66932.495,10721.602,10.000,-68.646},
				{67996.968,10567.844,10.000,-68.335},
				{69046.043,10413.657,10.000,-67.969},
				{70079.699,10259.469,10.000,-67.550},
				{71097.937,10105.282,10.000,-67.081},
				{72100.755,9951.095,10.000,-66.565},
				{73088.156,9796.907,10.000,-66.004},
				{74060.137,9642.720,10.000,-65.402},
				{75016.700,9488.533,10.000,-64.761},
				{75957.843,9334.345,10.000,-64.085},
				{76883.569,9180.158,10.000,-63.376},
				{77793.875,9025.971,10.000,-62.639},
				{78688.763,8871.783,10.000,-61.875},
				{79568.232,8717.596,10.000,-61.090},
				{80432.282,8563.409,10.000,-60.285},
				{81280.913,8409.221,10.000,-59.465},
				{82114.126,8255.034,10.000,-58.634},
				{82931.920,8100.847,10.000,-57.795},
				{83734.296,7946.659,10.000,-56.951},
				{84521.252,7792.472,10.000,-56.107},
				{85292.790,7638.285,10.000,-55.266},
				{86048.909,7484.097,10.000,-54.431},
				{86789.609,7329.910,10.000,-53.606},
				{87514.891,7175.723,10.000,-52.794},
				{88224.754,7021.535,10.000,-51.997},
				{88919.198,6867.348,10.000,-51.219},
				{89598.224,6713.161,10.000,-50.461},
				{90261.830,6558.973,10.000,-49.727},
				{90910.018,6404.786,10.000,-49.017},
				{91542.788,6250.599,10.000,-48.334},
				{92160.138,6096.411,10.000,-47.679},
				{92762.070,5942.224,10.000,-47.052},
				{93348.583,5788.037,10.000,-46.456},
				{93919.677,5633.849,10.000,-45.890},
				{94475.353,5479.662,10.000,-45.355},
				{95015.610,5325.475,10.000,-44.851},
				{95540.448,5171.287,10.000,-44.378},
				{96049.867,5017.100,10.000,-43.935},
				{96543.868,4862.913,10.000,-43.523},
				{97022.450,4708.725,10.000,-43.140},
				{97485.613,4554.538,10.000,-42.786},
				{97933.357,4400.351,10.000,-42.460},
				{98365.683,4246.163,10.000,-42.161},
				{98782.590,4091.976,10.000,-41.889},
				{99184.078,3937.789,10.000,-41.641},
				{99570.148,3783.601,10.000,-41.417},
				{99940.798,3629.414,10.000,-41.216},
				{100296.030,3475.227,10.000,-41.036},
				{100635.844,3321.039,10.000,-40.876},
				{100960.238,3166.852,10.000,-40.735},
				{101269.214,3012.665,10.000,-40.611},
				{101562.771,2858.477,10.000,-40.503},
				{101840.910,2704.290,10.000,-40.410},
				{102103.629,2550.103,10.000,-40.330},
				{102350.930,2395.915,10.000,-40.263},
				{102582.812,2241.728,10.000,-40.206},
				{102799.276,2087.541,10.000,-40.159},
				{103000.320,1933.353,10.000,-40.121},
				{103185.946,1779.166,10.000,-40.090},
				{103356.154,1624.979,10.000,-40.066},
				{103510.942,1470.791,10.000,-40.047},
				{103650.312,1316.604,10.000,-40.032},
				{103774.263,1162.417,10.000,-40.022},
				{103882.795,1008.229,10.000,-40.014},
				{103976.438,864.626,10.000,-40.009},
				{104056.271,732.036,10.000,-40.005},
				{104123.396,610.459,10.000,-40.003},
				{104178.914,499.896,10.000,-40.002},
				{104223.926,400.346,10.000,-40.001},
				{104259.534,311.810,10.000,-40.000},
				{104286.838,234.287,10.000,-40.000},
				{104306.942,167.777,10.000,-40.000},
				{104320.944,112.281,10.000,-40.000},
				{104329.948,67.798,10.000,-40.000},
				{104335.055,34.328,10.000,-40.000},
				{104337.365,11.872,10.000,-40.000},
				{104337.980,0.429,10.000,-40.000},
				{104338.001,0.000,10.000,-40.000},
				{104338.001,0.000,10.000,-40.000}		};

}