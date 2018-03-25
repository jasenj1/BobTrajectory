package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class FifteenFeetArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (15.00,0.00,0.00)
	
    public FifteenFeetArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public FifteenFeetArc(boolean flipped) {
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
				{733.100,1418.904,10.000,0.000},
				{884.450,1608.091,10.000,0.000},
				{1055.310,1809.103,10.000,0.000},
				{1246.862,2021.938,10.000,0.000},
				{1460.289,2246.598,10.000,0.000},
				{1696.773,2483.082,10.000,0.000},
				{1956.905,2719.566,10.000,0.000},
				{2240.686,2956.050,10.000,0.000},
				{2548.115,3192.534,10.000,0.000},
				{2879.193,3429.018,10.000,0.000},
				{3233.919,3665.502,10.000,0.000},
				{3612.293,3901.986,10.000,0.000},
				{4014.316,4138.470,10.000,0.000},
				{4439.987,4374.954,10.000,0.000},
				{4889.307,4611.438,10.000,0.000},
				{5362.275,4847.922,10.000,0.000},
				{5858.891,5084.406,10.000,0.000},
				{6379.156,5320.890,10.000,0.000},
				{6923.069,5557.374,10.000,0.000},
				{7490.631,5793.858,10.000,0.000},
				{8081.841,6030.342,10.000,0.000},
				{8696.699,6266.826,10.000,0.000},
				{9335.206,6503.310,10.000,0.000},
				{9997.361,6739.794,10.000,0.000},
				{10683.164,6976.278,10.000,0.000},
				{11392.616,7212.762,10.000,0.000},
				{12125.717,7449.246,10.000,0.000},
				{12882.466,7685.730,10.000,0.000},
				{13662.863,7922.214,10.000,0.000},
				{14466.908,8158.698,10.000,0.000},
				{15294.602,8395.182,10.000,0.000},
				{16145.945,8631.666,10.000,0.000},
				{17020.936,8868.150,10.000,0.000},
				{17919.575,9104.634,10.000,0.000},
				{18841.862,9341.118,10.000,0.000},
				{19787.798,9577.602,10.000,0.000},
				{20757.383,9814.086,10.000,0.000},
				{21750.615,10050.570,10.000,0.000},
				{22767.497,10287.054,10.000,0.000},
				{23808.026,10523.538,10.000,0.000},
				{24872.204,10760.022,10.000,0.000},
				{25960.031,10996.506,10.000,0.000},
				{27071.505,11232.990,10.000,0.000},
				{28206.628,11469.474,10.000,0.000},
				{29365.400,11705.958,10.000,0.000},
				{30547.820,11942.442,10.000,0.000},
				{31753.888,12178.926,10.000,0.000},
				{32983.605,12415.410,10.000,0.000},
				{34236.970,12651.894,10.000,0.000},
				{35513.984,12888.378,10.000,0.000},
				{36814.646,13124.862,10.000,0.000},
				{38138.956,13361.346,10.000,0.000},
				{39486.915,13597.830,10.000,0.000},
				{40858.522,13834.314,10.000,0.000},
				{42253.778,14070.798,10.000,0.000},
				{43672.682,14307.282,10.000,0.000},
				{45115.234,14543.766,10.000,0.000},
				{46581.435,14780.250,10.000,0.000},
				{48071.284,15016.734,10.000,0.000},
				{49584.782,15253.218,10.000,0.000},
				{51121.928,15489.702,10.000,0.000},
				{52682.722,15726.186,10.000,0.000},
				{54267.165,15962.670,10.000,0.000},
				{55875.256,16199.154,10.000,0.000},
				{57506.995,16435.638,10.000,0.000},
				{59162.383,16672.122,10.000,0.000},
				{60841.420,16908.606,10.000,0.000},
				{62544.105,17145.090,10.000,0.000},
				{64270.438,17381.574,10.000,0.000},
				{66020.419,17618.058,10.000,0.000},
				{67793.458,17842.717,10.000,0.000},
				{69588.372,18055.553,10.000,0.000},
				{71403.977,18256.564,10.000,0.000},
				{73239.093,18445.752,10.000,0.000},
				{75092.537,18623.115,10.000,0.000},
				{76963.125,18788.653,10.000,0.000},
				{78849.676,18942.368,10.000,0.000},
				{80751.007,19084.258,10.000,0.000},
				{82665.936,19214.325,10.000,0.000},
				{84593.281,19332.567,10.000,0.000},
				{86531.859,19438.984,10.000,0.000},
				{88480.487,19533.578,10.000,0.000},
				{90437.983,19616.347,10.000,0.000},
				{92403.165,19687.293,10.000,0.000},
				{94374.850,19746.414,10.000,0.000},
				{96351.856,19793.710,10.000,0.000},
				{98333.001,19829.183,10.000,0.000},
				{100317.102,19852.831,10.000,0.000},
				{102302.976,19864.656,10.000,0.000},
				{104289.442,19864.656,10.000,0.000},
				{106275.907,19864.656,10.000,0.000},
				{108262.373,19864.656,10.000,0.000},
				{110248.838,19864.656,10.000,0.000},
				{112235.304,19864.656,10.000,0.000},
				{114221.770,19864.656,10.000,0.000},
				{116208.235,19864.656,10.000,0.000},
				{118194.701,19864.656,10.000,0.000},
				{120181.166,19864.656,10.000,0.000},
				{122167.632,19864.656,10.000,0.000},
				{124154.097,19864.656,10.000,0.000},
				{126140.563,19864.656,10.000,0.000},
				{128127.028,19864.656,10.000,0.000},
				{130113.494,19864.656,10.000,0.000},
				{132099.960,19864.656,10.000,0.000},
				{134086.425,19864.656,10.000,0.000},
				{136072.891,19864.656,10.000,0.000},
				{138059.356,19864.656,10.000,0.000},
				{140045.822,19864.656,10.000,0.000},
				{142032.287,19864.656,10.000,0.000},
				{144018.753,19864.656,10.000,0.000},
				{146005.218,19864.656,10.000,0.000},
				{147991.684,19864.656,10.000,0.000},
				{149978.150,19864.656,10.000,0.000},
				{151964.615,19864.656,10.000,0.000},
				{153951.081,19864.656,10.000,0.000},
				{155937.546,19864.656,10.000,0.000},
				{157924.012,19864.656,10.000,0.000},
				{159910.477,19864.656,10.000,0.000},
				{161896.943,19864.656,10.000,0.000},
				{163883.408,19864.656,10.000,0.000},
				{165869.874,19864.656,10.000,0.000},
				{167856.340,19864.656,10.000,0.000},
				{169842.805,19864.656,10.000,0.000},
				{171829.271,19864.656,10.000,0.000},
				{173815.736,19864.656,10.000,0.000},
				{175802.202,19864.656,10.000,0.000},
				{177788.667,19864.656,10.000,0.000},
				{179775.133,19864.656,10.000,0.000},
				{181761.598,19864.656,10.000,0.000},
				{183748.064,19864.656,10.000,0.000},
				{185734.530,19864.656,10.000,0.000},
				{187720.995,19864.656,10.000,0.000},
				{189707.461,19864.656,10.000,0.000},
				{191693.926,19864.656,10.000,0.000},
				{193680.392,19864.656,10.000,0.000},
				{195666.857,19864.656,10.000,0.000},
				{197652.732,19852.831,10.000,0.000},
				{199636.832,19829.183,10.000,0.000},
				{201617.977,19793.710,10.000,0.000},
				{203594.983,19746.414,10.000,0.000},
				{205566.669,19687.293,10.000,0.000},
				{207531.851,19616.347,10.000,0.000},
				{209489.347,19533.578,10.000,0.000},
				{211437.975,19438.984,10.000,0.000},
				{213376.553,19332.567,10.000,0.000},
				{215303.897,19214.325,10.000,0.000},
				{217218.826,19084.258,10.000,0.000},
				{219120.158,18942.368,10.000,0.000},
				{221006.709,18788.653,10.000,0.000},
				{222877.297,18623.115,10.000,0.000},
				{224730.740,18445.752,10.000,0.000},
				{226565.856,18256.564,10.000,0.000},
				{228381.462,18055.553,10.000,0.000},
				{230176.376,17842.717,10.000,0.000},
				{231949.414,17618.058,10.000,0.000},
				{233699.396,17381.574,10.000,0.000},
				{235425.729,17145.090,10.000,0.000},
				{237128.414,16908.606,10.000,0.000},
				{238807.450,16672.122,10.000,0.000},
				{240462.838,16435.638,10.000,0.000},
				{242094.578,16199.154,10.000,0.000},
				{243702.669,15962.670,10.000,0.000},
				{245287.112,15726.186,10.000,0.000},
				{246847.906,15489.702,10.000,0.000},
				{248385.052,15253.218,10.000,0.000},
				{249898.549,15016.734,10.000,0.000},
				{251388.399,14780.250,10.000,0.000},
				{252854.599,14543.766,10.000,0.000},
				{254297.152,14307.282,10.000,0.000},
				{255716.056,14070.798,10.000,0.000},
				{257111.311,13834.314,10.000,0.000},
				{258482.918,13597.830,10.000,0.000},
				{259830.877,13361.346,10.000,0.000},
				{261155.188,13124.862,10.000,0.000},
				{262455.850,12888.378,10.000,0.000},
				{263732.863,12651.894,10.000,0.000},
				{264986.228,12415.410,10.000,0.000},
				{266215.945,12178.926,10.000,0.000},
				{267422.013,11942.442,10.000,0.000},
				{268604.433,11705.958,10.000,0.000},
				{269763.205,11469.474,10.000,0.000},
				{270898.328,11232.990,10.000,0.000},
				{272009.803,10996.506,10.000,0.000},
				{273097.629,10760.022,10.000,0.000},
				{274161.807,10523.538,10.000,0.000},
				{275202.337,10287.054,10.000,0.000},
				{276219.218,10050.570,10.000,0.000},
				{277212.451,9814.086,10.000,0.000},
				{278182.035,9577.602,10.000,0.000},
				{279127.971,9341.118,10.000,0.000},
				{280050.259,9104.634,10.000,0.000},
				{280948.898,8868.150,10.000,0.000},
				{281823.889,8631.666,10.000,0.000},
				{282675.231,8395.182,10.000,0.000},
				{283502.925,8158.698,10.000,0.000},
				{284306.971,7922.214,10.000,0.000},
				{285087.368,7685.730,10.000,0.000},
				{285844.117,7449.246,10.000,0.000},
				{286577.217,7212.762,10.000,0.000},
				{287286.669,6976.278,10.000,0.000},
				{287972.473,6739.794,10.000,0.000},
				{288634.628,6503.310,10.000,0.000},
				{289273.135,6266.826,10.000,0.000},
				{289887.993,6030.342,10.000,0.000},
				{290479.203,5793.858,10.000,0.000},
				{291046.765,5557.374,10.000,0.000},
				{291590.678,5320.890,10.000,0.000},
				{292110.943,5084.406,10.000,0.000},
				{292607.559,4847.922,10.000,0.000},
				{293080.527,4611.438,10.000,0.000},
				{293529.847,4374.954,10.000,0.000},
				{293955.518,4138.470,10.000,0.000},
				{294357.541,3901.986,10.000,0.000},
				{294735.915,3665.502,10.000,0.000},
				{295090.641,3429.018,10.000,0.000},
				{295421.718,3192.534,10.000,0.000},
				{295729.148,2956.050,10.000,0.000},
				{296012.928,2719.566,10.000,0.000},
				{296273.061,2483.082,10.000,0.000},
				{296509.545,2246.598,10.000,0.000},
				{296722.972,2021.938,10.000,0.000},
				{296914.524,1809.103,10.000,0.000},
				{297085.383,1608.091,10.000,0.000},
				{297236.733,1418.904,10.000,0.000},
				{297369.755,1241.541,10.000,0.000},
				{297485.633,1076.002,10.000,0.000},
				{297585.547,922.288,10.000,0.000},
				{297670.681,780.397,10.000,0.000},
				{297742.218,650.331,10.000,0.000},
				{297801.339,532.089,10.000,0.000},
				{297849.227,425.671,10.000,0.000},
				{297887.064,331.078,10.000,0.000},
				{297916.033,248.308,10.000,0.000},
				{297937.317,177.363,10.000,0.000},
				{297952.097,118.242,10.000,0.000},
				{297961.557,70.945,10.000,0.000},
				{297966.877,35.473,10.000,0.000},
				{297969.242,11.824,10.000,0.000},
				{297969.834,0.000,10.000,0.000},
				{297969.834,0.000,10.000,0.000}		};

}