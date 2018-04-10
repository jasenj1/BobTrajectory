package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class TestSTurnAutoArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (8.38,5.50,0.00)
	
    public TestSTurnAutoArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public TestSTurnAutoArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.591,11.824,10.000,0.000},
				{2.956,35.473,10.000,0.000},
				{8.277,70.945,10.000,0.000},
				{17.736,118.242,10.000,0.000},
				{32.517,177.363,10.000,0.000},
				{53.800,248.308,10.000,0.000},
				{82.769,331.078,10.000,0.000},
				{120.607,425.671,10.000,0.000},
				{168.495,532.089,10.000,0.000},
				{227.616,650.331,10.000,0.000},
				{299.152,780.397,10.000,0.000},
				{384.286,922.288,10.000,0.000},
				{484.201,1076.002,10.000,0.000},
				{600.078,1241.541,10.000,0.000},
				{733.100,1418.904,10.000,0.010},
				{884.450,1608.091,10.000,0.010},
				{1055.310,1809.103,10.000,0.020},
				{1246.862,2021.938,10.000,0.020},
				{1460.289,2246.598,10.000,0.030},
				{1696.773,2483.082,10.000,0.040},
				{1956.905,2719.566,10.000,0.050},
				{2240.686,2956.050,10.000,0.070},
				{2548.115,3192.534,10.000,0.090},
				{2879.193,3429.018,10.000,0.110},
				{3233.919,3665.502,10.000,0.140},
				{3612.293,3901.986,10.000,0.180},
				{4014.316,4138.470,10.000,0.220},
				{4439.987,4374.954,10.000,0.270},
				{4889.307,4611.438,10.000,0.320},
				{5362.275,4847.922,10.000,0.380},
				{5858.891,5084.406,10.000,0.460},
				{6379.156,5320.890,10.000,0.540},
				{6923.069,5557.374,10.000,0.640},
				{7490.631,5793.858,10.000,0.740},
				{8081.841,6030.342,10.000,0.860},
				{8696.699,6266.826,10.000,0.990},
				{9335.206,6503.310,10.000,1.140},
				{9997.361,6739.794,10.000,1.310},
				{10683.164,6976.278,10.000,1.490},
				{11392.616,7212.762,10.000,1.690},
				{12125.717,7449.246,10.000,1.910},
				{12882.466,7685.730,10.000,2.150},
				{13662.863,7922.214,10.000,2.410},
				{14466.908,8158.698,10.000,2.700},
				{15294.602,8395.182,10.000,3.010},
				{16145.945,8631.666,10.000,3.350},
				{17020.936,8868.150,10.000,3.710},
				{17919.575,9104.634,10.000,4.110},
				{18841.862,9341.118,10.000,4.530},
				{19787.798,9577.602,10.000,4.990},
				{20757.383,9814.086,10.000,5.490},
				{21750.615,10050.570,10.000,6.020},
				{22767.497,10287.054,10.000,6.590},
				{23808.026,10523.538,10.000,7.200},
				{24872.204,10760.022,10.000,7.860},
				{25960.031,10996.506,10.000,8.560},
				{27071.505,11232.990,10.000,9.300},
				{28206.628,11469.474,10.000,10.100},
				{29365.400,11705.958,10.000,10.940},
				{30547.820,11942.442,10.000,11.840},
				{31753.888,12178.926,10.000,12.800},
				{32983.605,12415.410,10.000,13.810},
				{34236.970,12651.894,10.000,14.880},
				{35513.984,12888.378,10.000,16.000},
				{36814.646,13124.862,10.000,17.190},
				{38138.956,13361.346,10.000,18.430},
				{39486.915,13597.830,10.000,19.730},
				{40858.522,13834.314,10.000,21.100},
				{42253.778,14070.798,10.000,22.510},
				{43672.682,14307.282,10.000,23.980},
				{45115.234,14543.766,10.000,25.500},
				{46581.435,14780.250,10.000,27.060},
				{48071.284,15016.734,10.000,28.670},
				{49584.782,15253.218,10.000,30.310},
				{51121.928,15489.702,10.000,31.970},
				{52682.722,15726.186,10.000,33.650},
				{54267.165,15962.670,10.000,35.340},
				{55875.256,16199.154,10.000,37.040},
				{57506.995,16435.638,10.000,38.720},
				{59162.383,16672.122,10.000,40.390},
				{60841.420,16908.606,10.000,42.040},
				{62544.105,17145.090,10.000,43.650},
				{64270.438,17381.574,10.000,45.230},
				{66020.419,17618.058,10.000,46.760},
				{67793.458,17842.717,10.000,48.230},
				{69588.372,18055.553,10.000,49.650},
				{71403.977,18256.564,10.000,51.000},
				{73239.093,18445.752,10.000,52.290},
				{75092.537,18623.115,10.000,53.500},
				{76963.125,18788.653,10.000,54.640},
				{78849.676,18942.368,10.000,55.710},
				{80751.007,19084.258,10.000,56.710},
				{82665.936,19214.325,10.000,57.630},
				{84593.281,19332.567,10.000,58.470},
				{86531.859,19438.984,10.000,59.250},
				{88480.487,19533.578,10.000,59.950},
				{90437.983,19616.347,10.000,60.580},
				{92403.165,19687.293,10.000,61.130},
				{94374.850,19746.414,10.000,61.620},
				{96351.856,19793.710,10.000,62.040},
				{98333.001,19829.183,10.000,62.390},
				{100317.102,19852.831,10.000,62.680},
				{102302.976,19864.656,10.000,62.900},
				{104289.442,19864.656,10.000,63.060},
				{106275.907,19864.656,10.000,63.150},
				{108262.373,19864.656,10.000,63.180},
				{110248.838,19864.656,10.000,63.140},
				{112235.304,19864.656,10.000,63.040},
				{114221.701,19863.286,10.000,62.880},
				{116207.370,19850.093,10.000,62.650},
				{118191.128,19825.076,10.000,62.360},
				{120171.794,19788.234,10.000,62.000},
				{122148.184,19739.568,10.000,61.570},
				{124119.116,19679.078,10.000,61.070},
				{126083.408,19606.764,10.000,60.510},
				{128039.878,19522.625,10.000,59.870},
				{129987.342,19426.662,10.000,59.160},
				{131924.619,19318.876,10.000,58.380},
				{133850.526,19199.264,10.000,57.530},
				{135763.881,19067.829,10.000,56.600},
				{137663.501,18924.570,10.000,55.590},
				{139548.204,18769.486,10.000,54.520},
				{141416.807,18602.578,10.000,53.360},
				{143268.128,18423.846,10.000,52.140},
				{145100.985,18233.290,10.000,50.850},
				{146914.195,18030.909,10.000,49.490},
				{148706.575,17816.704,10.000,48.060},
				{150476.944,17590.676,10.000,46.580},
				{152224.188,17354.192,10.000,45.050},
				{153947.783,17117.708,10.000,43.470},
				{155647.729,16881.224,10.000,41.850},
				{157324.027,16644.740,10.000,40.200},
				{158976.677,16408.256,10.000,38.530},
				{160605.678,16171.772,10.000,36.840},
				{162211.031,15935.288,10.000,35.150},
				{163792.736,15698.804,10.000,33.460},
				{165350.792,15462.320,10.000,31.780},
				{166885.200,15225.836,10.000,30.120},
				{168395.959,14989.352,10.000,28.480},
				{169883.070,14752.868,10.000,26.880},
				{171346.533,14516.384,10.000,25.320},
				{172786.347,14279.900,10.000,23.810},
				{174202.513,14043.416,10.000,22.350},
				{175595.030,13806.932,10.000,20.940},
				{176963.899,13570.448,10.000,19.580},
				{178309.120,13333.964,10.000,18.290},
				{179630.692,13097.480,10.000,17.050},
				{180928.616,12860.996,10.000,15.870},
				{182202.891,12624.512,10.000,14.750},
				{183453.518,12388.028,10.000,13.690},
				{184680.496,12151.544,10.000,12.690},
				{185883.827,11915.060,10.000,11.740},
				{187063.508,11678.576,10.000,10.850},
				{188219.542,11442.092,10.000,10.000},
				{189351.927,11205.608,10.000,9.210},
				{190460.663,10969.124,10.000,8.470},
				{191545.751,10732.640,10.000,7.780},
				{192607.191,10496.156,10.000,7.130},
				{193644.983,10259.672,10.000,6.520},
				{194659.126,10023.188,10.000,5.960},
				{195649.620,9786.704,10.000,5.430},
				{196616.466,9550.220,10.000,4.940},
				{197559.664,9313.736,10.000,4.480},
				{198479.213,9077.252,10.000,4.060},
				{199375.114,8840.768,10.000,3.670},
				{200247.367,8604.284,10.000,3.310},
				{201095.971,8367.800,10.000,2.970},
				{201920.927,8131.316,10.000,2.660},
				{202722.234,7894.832,10.000,2.380},
				{203499.893,7658.348,10.000,2.120},
				{204253.904,7421.864,10.000,1.880},
				{204984.266,7185.380,10.000,1.660},
				{205690.980,6948.896,10.000,1.470},
				{206374.045,6712.412,10.000,1.290},
				{207033.462,6475.928,10.000,1.130},
				{207669.231,6239.444,10.000,0.980},
				{208281.351,6002.960,10.000,0.850},
				{208869.823,5766.476,10.000,0.730},
				{209434.646,5529.992,10.000,0.620},
				{209975.821,5293.508,10.000,0.530},
				{210493.348,5057.024,10.000,0.450},
				{210987.226,4820.540,10.000,0.380},
				{211457.456,4584.056,10.000,0.310},
				{211904.037,4347.572,10.000,0.260},
				{212326.970,4111.088,10.000,0.210},
				{212726.255,3874.604,10.000,0.170},
				{213101.891,3638.120,10.000,0.140},
				{213453.879,3401.636,10.000,0.110},
				{213782.218,3165.152,10.000,0.090},
				{214086.909,2928.668,10.000,0.070},
				{214367.951,2692.184,10.000,0.050},
				{214625.346,2455.700,10.000,0.040},
				{214859.160,2220.585,10.000,0.030},
				{215070.054,1997.294,10.000,0.020},
				{215259.210,1785.828,10.000,0.010},
				{215427.811,1586.186,10.000,0.010},
				{215577.038,1398.367,10.000,0.010},
				{215708.075,1222.374,10.000,0.000},
				{215822.104,1058.204,10.000,0.000},
				{215920.307,905.858,10.000,0.000},
				{216003.867,765.337,10.000,0.000},
				{216073.966,636.640,10.000,0.000},
				{216131.786,519.767,10.000,0.000},
				{216178.511,414.718,10.000,0.000},
				{216215.321,321.494,10.000,0.000},
				{216243.401,240.094,10.000,0.000},
				{216263.931,170.517,10.000,0.000},
				{216278.095,112.766,10.000,0.000},
				{216287.075,66.838,10.000,0.000},
				{216292.054,32.734,10.000,0.000},
				{216294.214,10.455,10.000,0.000},
				{216294.736,0.000,10.000,0.000},
				{216294.736,0.000,10.000,0.000}		};

}