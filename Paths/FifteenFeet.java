package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class FifteenFeet extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (15.00,0.00,0.00)
	
	public FifteenFeet() {
		this(false);
	}
			
    public FifteenFeet(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.567,11.339,10.000},
				{2.835,22.679,10.000},
				{7.938,51.027,10.000},
				{17.009,90.714,10.000},
				{31.183,141.741,10.000},
				{51.594,204.108,10.000},
				{79.375,277.813,10.000},
				{115.661,362.858,10.000},
				{161.585,459.242,10.000},
				{218.282,566.966,10.000},
				{286.885,686.028,10.000},
				{368.528,816.430,10.000},
				{464.345,958.172,10.000},
				{575.470,1111.253,10.000},
				{702.470,1270.003,10.000},
				{845.346,1428.753,10.000},
				{1004.096,1587.504,10.000},
				{1178.721,1746.254,10.000},
				{1369.222,1905.004,10.000},
				{1575.597,2063.755,10.000},
				{1797.848,2222.505,10.000},
				{2035.973,2381.255,10.000},
				{2289.974,2540.006,10.000},
				{2559.850,2698.756,10.000},
				{2845.600,2857.506,10.000},
				{3147.226,3016.257,10.000},
				{3464.727,3175.007,10.000},
				{3798.102,3333.758,10.000},
				{4147.353,3492.508,10.000},
				{4512.479,3651.258,10.000},
				{4893.480,3810.009,10.000},
				{5290.356,3968.759,10.000},
				{5703.107,4127.509,10.000},
				{6131.733,4286.260,10.000},
				{6576.234,4445.010,10.000},
				{7036.610,4603.760,10.000},
				{7512.861,4762.511,10.000},
				{8004.987,4921.261,10.000},
				{8512.988,5080.011,10.000},
				{9036.864,5238.762,10.000},
				{9576.615,5397.512,10.000},
				{10132.242,5556.263,10.000},
				{10703.743,5715.013,10.000},
				{11291.119,5873.763,10.000},
				{11894.371,6032.514,10.000},
				{12513.497,6191.264,10.000},
				{13148.498,6350.014,10.000},
				{13799.375,6508.765,10.000},
				{14466.126,6667.515,10.000},
				{15148.753,6826.265,10.000},
				{15847.255,6985.016,10.000},
				{16561.631,7143.766,10.000},
				{17291.883,7302.516,10.000},
				{18038.009,7461.267,10.000},
				{18800.011,7620.017,10.000},
				{19577.888,7778.768,10.000},
				{20371.640,7937.518,10.000},
				{21181.267,8096.268,10.000},
				{22006.768,8255.019,10.000},
				{22848.145,8413.769,10.000},
				{23705.397,8572.519,10.000},
				{24578.524,8731.270,10.000},
				{25467.526,8890.020,10.000},
				{26372.403,9048.770,10.000},
				{27293.155,9207.521,10.000},
				{28229.782,9366.271,10.000},
				{29182.285,9525.022,10.000},
				{30150.662,9683.772,10.000},
				{31134.914,9842.522,10.000},
				{32135.041,10001.273,10.000},
				{33151.044,10160.023,10.000},
				{34182.921,10318.773,10.000},
				{35230.673,10477.524,10.000},
				{36294.301,10636.274,10.000},
				{37373.803,10795.024,10.000},
				{38468.614,10948.105,10.000},
				{39577.598,11089.846,10.000},
				{40699.623,11220.249,10.000},
				{41833.554,11339.311,10.000},
				{42978.258,11447.035,10.000},
				{44132.600,11543.419,10.000},
				{45295.446,11628.464,10.000},
				{46465.663,11702.169,10.000},
				{47642.117,11764.535,10.000},
				{48823.673,11815.562,10.000},
				{50009.198,11855.250,10.000},
				{51197.558,11883.598,10.000},
				{52387.618,11900.607,10.000},
				{53578.246,11906.277,10.000},
				{54768.874,11906.277,10.000},
				{55959.501,11906.277,10.000},
				{57150.129,11906.277,10.000},
				{58340.757,11906.277,10.000},
				{59531.384,11906.277,10.000},
				{60722.012,11906.277,10.000},
				{61912.640,11906.277,10.000},
				{63103.268,11906.277,10.000},
				{64293.895,11906.277,10.000},
				{65484.523,11906.277,10.000},
				{66675.151,11906.277,10.000},
				{67865.778,11906.277,10.000},
				{69056.406,11906.277,10.000},
				{70247.034,11906.277,10.000},
				{71437.661,11906.277,10.000},
				{72628.289,11906.277,10.000},
				{73818.917,11906.277,10.000},
				{75009.544,11906.277,10.000},
				{76200.172,11906.277,10.000},
				{77390.800,11906.277,10.000},
				{78581.427,11906.277,10.000},
				{79772.055,11906.277,10.000},
				{80962.683,11906.277,10.000},
				{82153.311,11906.277,10.000},
				{83343.938,11906.277,10.000},
				{84534.566,11906.277,10.000},
				{85725.194,11906.277,10.000},
				{86915.821,11906.277,10.000},
				{88106.449,11906.277,10.000},
				{89297.077,11906.277,10.000},
				{90487.704,11906.277,10.000},
				{91678.332,11906.277,10.000},
				{92868.960,11906.277,10.000},
				{94059.587,11906.277,10.000},
				{95250.215,11906.277,10.000},
				{96440.843,11906.277,10.000},
				{97631.470,11906.277,10.000},
				{98822.098,11906.277,10.000},
				{100012.726,11906.277,10.000},
				{101203.354,11906.277,10.000},
				{102393.981,11906.277,10.000},
				{103584.609,11906.277,10.000},
				{104775.237,11906.277,10.000},
				{105965.864,11906.277,10.000},
				{107156.492,11906.277,10.000},
				{108347.120,11906.277,10.000},
				{109537.747,11906.277,10.000},
				{110728.375,11906.277,10.000},
				{111919.003,11906.277,10.000},
				{113109.630,11906.277,10.000},
				{114300.258,11906.277,10.000},
				{115490.886,11906.277,10.000},
				{116681.513,11906.277,10.000},
				{117872.141,11906.277,10.000},
				{119062.769,11906.277,10.000},
				{120253.397,11906.277,10.000},
				{121444.024,11906.277,10.000},
				{122634.652,11906.277,10.000},
				{123825.280,11906.277,10.000},
				{125015.907,11906.277,10.000},
				{126206.535,11906.277,10.000},
				{127397.163,11906.277,10.000},
				{128587.790,11906.277,10.000},
				{129778.418,11906.277,10.000},
				{130969.046,11906.277,10.000},
				{132159.673,11906.277,10.000},
				{133350.301,11906.277,10.000},
				{134540.929,11906.277,10.000},
				{135731.557,11906.277,10.000},
				{136922.184,11906.277,10.000},
				{138112.812,11906.277,10.000},
				{139303.440,11906.277,10.000},
				{140494.067,11906.277,10.000},
				{141684.695,11906.277,10.000},
				{142875.323,11906.277,10.000},
				{144065.950,11906.277,10.000},
				{145256.578,11906.277,10.000},
				{146447.206,11906.277,10.000},
				{147637.833,11906.277,10.000},
				{148828.461,11906.277,10.000},
				{150019.089,11906.277,10.000},
				{151209.716,11906.277,10.000},
				{152400.344,11906.277,10.000},
				{153590.972,11906.277,10.000},
				{154781.600,11906.277,10.000},
				{155972.227,11906.277,10.000},
				{157162.855,11906.277,10.000},
				{158353.483,11906.277,10.000},
				{159544.110,11906.277,10.000},
				{160734.738,11906.277,10.000},
				{161925.366,11906.277,10.000},
				{163115.993,11906.277,10.000},
				{164306.621,11906.277,10.000},
				{165497.249,11906.277,10.000},
				{166687.876,11906.277,10.000},
				{167878.504,11906.277,10.000},
				{169069.132,11906.277,10.000},
				{170259.759,11906.277,10.000},
				{171450.387,11906.277,10.000},
				{172641.015,11906.277,10.000},
				{173831.643,11906.277,10.000},
				{175022.270,11906.277,10.000},
				{176212.898,11906.277,10.000},
				{177403.526,11906.277,10.000},
				{178594.153,11906.277,10.000},
				{179784.781,11906.277,10.000},
				{180975.409,11906.277,10.000},
				{182166.036,11906.277,10.000},
				{183356.664,11906.277,10.000},
				{184547.292,11906.277,10.000},
				{185737.919,11906.277,10.000},
				{186928.547,11906.277,10.000},
				{188119.175,11906.277,10.000},
				{189309.803,11906.277,10.000},
				{190500.430,11906.277,10.000},
				{191691.058,11906.277,10.000},
				{192881.686,11906.277,10.000},
				{194072.313,11906.277,10.000},
				{195262.941,11906.277,10.000},
				{196453.569,11906.277,10.000},
				{197644.196,11906.277,10.000},
				{198834.824,11906.277,10.000},
				{200025.452,11906.277,10.000},
				{201216.079,11906.277,10.000},
				{202406.707,11906.277,10.000},
				{203597.335,11906.277,10.000},
				{204787.962,11906.277,10.000},
				{205978.590,11906.277,10.000},
				{207169.218,11906.277,10.000},
				{208359.846,11906.277,10.000},
				{209550.473,11906.277,10.000},
				{210741.101,11906.277,10.000},
				{211931.729,11906.277,10.000},
				{213122.356,11906.277,10.000},
				{214312.984,11906.277,10.000},
				{215503.612,11906.277,10.000},
				{216694.239,11906.277,10.000},
				{217884.867,11906.277,10.000},
				{219075.495,11906.277,10.000},
				{220266.122,11906.277,10.000},
				{221456.750,11906.277,10.000},
				{222647.378,11906.277,10.000},
				{223838.005,11906.277,10.000},
				{225028.633,11906.277,10.000},
				{226219.261,11906.277,10.000},
				{227409.889,11906.277,10.000},
				{228600.516,11906.277,10.000},
				{229791.144,11906.277,10.000},
				{230981.772,11906.277,10.000},
				{232172.399,11906.277,10.000},
				{233363.027,11906.277,10.000},
				{234553.655,11906.277,10.000},
				{235744.282,11906.277,10.000},
				{236934.910,11906.277,10.000},
				{238125.538,11906.277,10.000},
				{239316.165,11906.277,10.000},
				{240506.793,11906.277,10.000},
				{241697.421,11906.277,10.000},
				{242888.048,11906.277,10.000},
				{244078.676,11906.277,10.000},
				{245269.304,11906.277,10.000},
				{246459.365,11900.607,10.000},
				{247647.724,11883.598,10.000},
				{248833.249,11855.250,10.000},
				{250014.806,11815.562,10.000},
				{251191.259,11764.535,10.000},
				{252361.476,11702.169,10.000},
				{253524.323,11628.464,10.000},
				{254678.664,11543.419,10.000},
				{255823.368,11447.035,10.000},
				{256957.299,11339.311,10.000},
				{258079.324,11220.249,10.000},
				{259188.309,11089.846,10.000},
				{260283.119,10948.105,10.000},
				{261362.621,10795.024,10.000},
				{262426.249,10636.274,10.000},
				{263474.001,10477.524,10.000},
				{264505.879,10318.773,10.000},
				{265521.881,10160.023,10.000},
				{266522.008,10001.273,10.000},
				{267506.260,9842.522,10.000},
				{268474.638,9683.772,10.000},
				{269427.140,9525.022,10.000},
				{270363.767,9366.271,10.000},
				{271284.519,9207.521,10.000},
				{272189.396,9048.770,10.000},
				{273078.398,8890.020,10.000},
				{273951.525,8731.270,10.000},
				{274808.777,8572.519,10.000},
				{275650.154,8413.769,10.000},
				{276475.656,8255.019,10.000},
				{277285.282,8096.268,10.000},
				{278079.034,7937.518,10.000},
				{278856.911,7778.768,10.000},
				{279618.913,7620.017,10.000},
				{280365.039,7461.267,10.000},
				{281095.291,7302.516,10.000},
				{281809.668,7143.766,10.000},
				{282508.169,6985.016,10.000},
				{283190.796,6826.265,10.000},
				{283857.547,6667.515,10.000},
				{284508.424,6508.765,10.000},
				{285143.425,6350.014,10.000},
				{285762.552,6191.264,10.000},
				{286365.803,6032.514,10.000},
				{286953.179,5873.763,10.000},
				{287524.681,5715.013,10.000},
				{288080.307,5556.263,10.000},
				{288620.058,5397.512,10.000},
				{289143.934,5238.762,10.000},
				{289651.935,5080.011,10.000},
				{290144.061,4921.261,10.000},
				{290620.313,4762.511,10.000},
				{291080.689,4603.760,10.000},
				{291525.190,4445.010,10.000},
				{291953.816,4286.260,10.000},
				{292366.566,4127.509,10.000},
				{292763.442,3968.759,10.000},
				{293144.443,3810.009,10.000},
				{293509.569,3651.258,10.000},
				{293858.820,3492.508,10.000},
				{294192.196,3333.758,10.000},
				{294509.696,3175.007,10.000},
				{294811.322,3016.257,10.000},
				{295097.073,2857.506,10.000},
				{295366.948,2698.756,10.000},
				{295620.949,2540.006,10.000},
				{295859.074,2381.255,10.000},
				{296081.325,2222.505,10.000},
				{296287.700,2063.755,10.000},
				{296478.201,1905.004,10.000},
				{296652.826,1746.254,10.000},
				{296811.577,1587.504,10.000},
				{296954.452,1428.753,10.000},
				{297081.452,1270.003,10.000},
				{297192.577,1111.253,10.000},
				{297288.395,958.172,10.000},
				{297370.038,816.430,10.000},
				{297438.640,686.028,10.000},
				{297495.337,566.966,10.000},
				{297541.261,459.242,10.000},
				{297577.547,362.858,10.000},
				{297605.328,277.813,10.000},
				{297625.739,204.108,10.000},
				{297639.913,141.741,10.000},
				{297648.985,90.714,10.000},
				{297654.087,51.027,10.000},
				{297656.355,22.679,10.000},
				{297656.922,5.670,10.000},
				{297656.922,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.567,11.339,10.000},
				{2.835,22.679,10.000},
				{7.938,51.027,10.000},
				{17.009,90.714,10.000},
				{31.183,141.741,10.000},
				{51.594,204.108,10.000},
				{79.375,277.813,10.000},
				{115.661,362.858,10.000},
				{161.585,459.242,10.000},
				{218.282,566.966,10.000},
				{286.885,686.028,10.000},
				{368.528,816.430,10.000},
				{464.345,958.172,10.000},
				{575.470,1111.253,10.000},
				{702.470,1270.003,10.000},
				{845.346,1428.753,10.000},
				{1004.096,1587.504,10.000},
				{1178.721,1746.254,10.000},
				{1369.222,1905.004,10.000},
				{1575.597,2063.755,10.000},
				{1797.848,2222.505,10.000},
				{2035.973,2381.255,10.000},
				{2289.974,2540.006,10.000},
				{2559.850,2698.756,10.000},
				{2845.600,2857.506,10.000},
				{3147.226,3016.257,10.000},
				{3464.727,3175.007,10.000},
				{3798.102,3333.758,10.000},
				{4147.353,3492.508,10.000},
				{4512.479,3651.258,10.000},
				{4893.480,3810.009,10.000},
				{5290.356,3968.759,10.000},
				{5703.107,4127.509,10.000},
				{6131.733,4286.260,10.000},
				{6576.234,4445.010,10.000},
				{7036.610,4603.760,10.000},
				{7512.861,4762.511,10.000},
				{8004.987,4921.261,10.000},
				{8512.988,5080.011,10.000},
				{9036.864,5238.762,10.000},
				{9576.615,5397.512,10.000},
				{10132.242,5556.263,10.000},
				{10703.743,5715.013,10.000},
				{11291.119,5873.763,10.000},
				{11894.371,6032.514,10.000},
				{12513.497,6191.264,10.000},
				{13148.498,6350.014,10.000},
				{13799.375,6508.765,10.000},
				{14466.126,6667.515,10.000},
				{15148.753,6826.265,10.000},
				{15847.255,6985.016,10.000},
				{16561.631,7143.766,10.000},
				{17291.883,7302.516,10.000},
				{18038.009,7461.267,10.000},
				{18800.011,7620.017,10.000},
				{19577.888,7778.768,10.000},
				{20371.640,7937.518,10.000},
				{21181.267,8096.268,10.000},
				{22006.768,8255.019,10.000},
				{22848.145,8413.769,10.000},
				{23705.397,8572.519,10.000},
				{24578.524,8731.270,10.000},
				{25467.526,8890.020,10.000},
				{26372.403,9048.770,10.000},
				{27293.155,9207.521,10.000},
				{28229.782,9366.271,10.000},
				{29182.285,9525.022,10.000},
				{30150.662,9683.772,10.000},
				{31134.914,9842.522,10.000},
				{32135.041,10001.273,10.000},
				{33151.044,10160.023,10.000},
				{34182.921,10318.773,10.000},
				{35230.673,10477.524,10.000},
				{36294.301,10636.274,10.000},
				{37373.803,10795.024,10.000},
				{38468.614,10948.105,10.000},
				{39577.598,11089.846,10.000},
				{40699.623,11220.249,10.000},
				{41833.554,11339.311,10.000},
				{42978.258,11447.035,10.000},
				{44132.600,11543.419,10.000},
				{45295.446,11628.464,10.000},
				{46465.663,11702.169,10.000},
				{47642.117,11764.535,10.000},
				{48823.673,11815.562,10.000},
				{50009.198,11855.250,10.000},
				{51197.558,11883.598,10.000},
				{52387.618,11900.607,10.000},
				{53578.246,11906.277,10.000},
				{54768.874,11906.277,10.000},
				{55959.501,11906.277,10.000},
				{57150.129,11906.277,10.000},
				{58340.757,11906.277,10.000},
				{59531.384,11906.277,10.000},
				{60722.012,11906.277,10.000},
				{61912.640,11906.277,10.000},
				{63103.268,11906.277,10.000},
				{64293.895,11906.277,10.000},
				{65484.523,11906.277,10.000},
				{66675.151,11906.277,10.000},
				{67865.778,11906.277,10.000},
				{69056.406,11906.277,10.000},
				{70247.034,11906.277,10.000},
				{71437.661,11906.277,10.000},
				{72628.289,11906.277,10.000},
				{73818.917,11906.277,10.000},
				{75009.544,11906.277,10.000},
				{76200.172,11906.277,10.000},
				{77390.800,11906.277,10.000},
				{78581.427,11906.277,10.000},
				{79772.055,11906.277,10.000},
				{80962.683,11906.277,10.000},
				{82153.311,11906.277,10.000},
				{83343.938,11906.277,10.000},
				{84534.566,11906.277,10.000},
				{85725.194,11906.277,10.000},
				{86915.821,11906.277,10.000},
				{88106.449,11906.277,10.000},
				{89297.077,11906.277,10.000},
				{90487.704,11906.277,10.000},
				{91678.332,11906.277,10.000},
				{92868.960,11906.277,10.000},
				{94059.587,11906.277,10.000},
				{95250.215,11906.277,10.000},
				{96440.843,11906.277,10.000},
				{97631.470,11906.277,10.000},
				{98822.098,11906.277,10.000},
				{100012.726,11906.277,10.000},
				{101203.354,11906.277,10.000},
				{102393.981,11906.277,10.000},
				{103584.609,11906.277,10.000},
				{104775.237,11906.277,10.000},
				{105965.864,11906.277,10.000},
				{107156.492,11906.277,10.000},
				{108347.120,11906.277,10.000},
				{109537.747,11906.277,10.000},
				{110728.375,11906.277,10.000},
				{111919.003,11906.277,10.000},
				{113109.630,11906.277,10.000},
				{114300.258,11906.277,10.000},
				{115490.886,11906.277,10.000},
				{116681.513,11906.277,10.000},
				{117872.141,11906.277,10.000},
				{119062.769,11906.277,10.000},
				{120253.397,11906.277,10.000},
				{121444.024,11906.277,10.000},
				{122634.652,11906.277,10.000},
				{123825.280,11906.277,10.000},
				{125015.907,11906.277,10.000},
				{126206.535,11906.277,10.000},
				{127397.163,11906.277,10.000},
				{128587.790,11906.277,10.000},
				{129778.418,11906.277,10.000},
				{130969.046,11906.277,10.000},
				{132159.673,11906.277,10.000},
				{133350.301,11906.277,10.000},
				{134540.929,11906.277,10.000},
				{135731.557,11906.277,10.000},
				{136922.184,11906.277,10.000},
				{138112.812,11906.277,10.000},
				{139303.440,11906.277,10.000},
				{140494.067,11906.277,10.000},
				{141684.695,11906.277,10.000},
				{142875.323,11906.277,10.000},
				{144065.950,11906.277,10.000},
				{145256.578,11906.277,10.000},
				{146447.206,11906.277,10.000},
				{147637.833,11906.277,10.000},
				{148828.461,11906.277,10.000},
				{150019.089,11906.277,10.000},
				{151209.716,11906.277,10.000},
				{152400.344,11906.277,10.000},
				{153590.972,11906.277,10.000},
				{154781.600,11906.277,10.000},
				{155972.227,11906.277,10.000},
				{157162.855,11906.277,10.000},
				{158353.483,11906.277,10.000},
				{159544.110,11906.277,10.000},
				{160734.738,11906.277,10.000},
				{161925.366,11906.277,10.000},
				{163115.993,11906.277,10.000},
				{164306.621,11906.277,10.000},
				{165497.249,11906.277,10.000},
				{166687.876,11906.277,10.000},
				{167878.504,11906.277,10.000},
				{169069.132,11906.277,10.000},
				{170259.759,11906.277,10.000},
				{171450.387,11906.277,10.000},
				{172641.015,11906.277,10.000},
				{173831.643,11906.277,10.000},
				{175022.270,11906.277,10.000},
				{176212.898,11906.277,10.000},
				{177403.526,11906.277,10.000},
				{178594.153,11906.277,10.000},
				{179784.781,11906.277,10.000},
				{180975.409,11906.277,10.000},
				{182166.036,11906.277,10.000},
				{183356.664,11906.277,10.000},
				{184547.292,11906.277,10.000},
				{185737.919,11906.277,10.000},
				{186928.547,11906.277,10.000},
				{188119.175,11906.277,10.000},
				{189309.803,11906.277,10.000},
				{190500.430,11906.277,10.000},
				{191691.058,11906.277,10.000},
				{192881.686,11906.277,10.000},
				{194072.313,11906.277,10.000},
				{195262.941,11906.277,10.000},
				{196453.569,11906.277,10.000},
				{197644.196,11906.277,10.000},
				{198834.824,11906.277,10.000},
				{200025.452,11906.277,10.000},
				{201216.079,11906.277,10.000},
				{202406.707,11906.277,10.000},
				{203597.335,11906.277,10.000},
				{204787.962,11906.277,10.000},
				{205978.590,11906.277,10.000},
				{207169.218,11906.277,10.000},
				{208359.846,11906.277,10.000},
				{209550.473,11906.277,10.000},
				{210741.101,11906.277,10.000},
				{211931.729,11906.277,10.000},
				{213122.356,11906.277,10.000},
				{214312.984,11906.277,10.000},
				{215503.612,11906.277,10.000},
				{216694.239,11906.277,10.000},
				{217884.867,11906.277,10.000},
				{219075.495,11906.277,10.000},
				{220266.122,11906.277,10.000},
				{221456.750,11906.277,10.000},
				{222647.378,11906.277,10.000},
				{223838.005,11906.277,10.000},
				{225028.633,11906.277,10.000},
				{226219.261,11906.277,10.000},
				{227409.889,11906.277,10.000},
				{228600.516,11906.277,10.000},
				{229791.144,11906.277,10.000},
				{230981.772,11906.277,10.000},
				{232172.399,11906.277,10.000},
				{233363.027,11906.277,10.000},
				{234553.655,11906.277,10.000},
				{235744.282,11906.277,10.000},
				{236934.910,11906.277,10.000},
				{238125.538,11906.277,10.000},
				{239316.165,11906.277,10.000},
				{240506.793,11906.277,10.000},
				{241697.421,11906.277,10.000},
				{242888.048,11906.277,10.000},
				{244078.676,11906.277,10.000},
				{245269.304,11906.277,10.000},
				{246459.365,11900.607,10.000},
				{247647.724,11883.598,10.000},
				{248833.249,11855.250,10.000},
				{250014.806,11815.562,10.000},
				{251191.259,11764.535,10.000},
				{252361.476,11702.169,10.000},
				{253524.323,11628.464,10.000},
				{254678.664,11543.419,10.000},
				{255823.368,11447.035,10.000},
				{256957.299,11339.311,10.000},
				{258079.324,11220.249,10.000},
				{259188.309,11089.846,10.000},
				{260283.119,10948.105,10.000},
				{261362.621,10795.024,10.000},
				{262426.249,10636.274,10.000},
				{263474.001,10477.524,10.000},
				{264505.879,10318.773,10.000},
				{265521.881,10160.023,10.000},
				{266522.008,10001.273,10.000},
				{267506.260,9842.522,10.000},
				{268474.638,9683.772,10.000},
				{269427.140,9525.022,10.000},
				{270363.767,9366.271,10.000},
				{271284.519,9207.521,10.000},
				{272189.396,9048.770,10.000},
				{273078.398,8890.020,10.000},
				{273951.525,8731.270,10.000},
				{274808.777,8572.519,10.000},
				{275650.154,8413.769,10.000},
				{276475.656,8255.019,10.000},
				{277285.282,8096.268,10.000},
				{278079.034,7937.518,10.000},
				{278856.911,7778.768,10.000},
				{279618.913,7620.017,10.000},
				{280365.039,7461.267,10.000},
				{281095.291,7302.516,10.000},
				{281809.668,7143.766,10.000},
				{282508.169,6985.016,10.000},
				{283190.796,6826.265,10.000},
				{283857.547,6667.515,10.000},
				{284508.424,6508.765,10.000},
				{285143.425,6350.014,10.000},
				{285762.552,6191.264,10.000},
				{286365.803,6032.514,10.000},
				{286953.179,5873.763,10.000},
				{287524.681,5715.013,10.000},
				{288080.307,5556.263,10.000},
				{288620.058,5397.512,10.000},
				{289143.934,5238.762,10.000},
				{289651.935,5080.011,10.000},
				{290144.061,4921.261,10.000},
				{290620.313,4762.511,10.000},
				{291080.689,4603.760,10.000},
				{291525.190,4445.010,10.000},
				{291953.816,4286.260,10.000},
				{292366.566,4127.509,10.000},
				{292763.442,3968.759,10.000},
				{293144.443,3810.009,10.000},
				{293509.569,3651.258,10.000},
				{293858.820,3492.508,10.000},
				{294192.196,3333.758,10.000},
				{294509.696,3175.007,10.000},
				{294811.322,3016.257,10.000},
				{295097.073,2857.506,10.000},
				{295366.948,2698.756,10.000},
				{295620.949,2540.006,10.000},
				{295859.074,2381.255,10.000},
				{296081.325,2222.505,10.000},
				{296287.700,2063.755,10.000},
				{296478.201,1905.004,10.000},
				{296652.826,1746.254,10.000},
				{296811.577,1587.504,10.000},
				{296954.452,1428.753,10.000},
				{297081.452,1270.003,10.000},
				{297192.577,1111.253,10.000},
				{297288.395,958.172,10.000},
				{297370.038,816.430,10.000},
				{297438.640,686.028,10.000},
				{297495.337,566.966,10.000},
				{297541.261,459.242,10.000},
				{297577.547,362.858,10.000},
				{297605.328,277.813,10.000},
				{297625.739,204.108,10.000},
				{297639.913,141.741,10.000},
				{297648.985,90.714,10.000},
				{297654.087,51.027,10.000},
				{297656.355,22.679,10.000},
				{297656.922,5.670,10.000},
				{297656.922,0.000,10.000}
		};
		
		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}