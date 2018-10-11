package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class LeftWallToRightScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,23.15,0.00)
	// (12.13,22.65,0.00)
	// (18.13,15.65,-89.99)
	// (18.13,12.35,-89.99)
	// (24.13,7.65,0.00)
	
    public LeftWallToRightScaleArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftWallToRightScaleArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.564,-11.280,10.000,-0.000},
				{-2.820,-33.839,10.000,-0.000},
				{-7.896,-67.678,10.000,-0.000},
				{-16.920,-112.797,10.000,-0.000},
				{-31.019,-169.196,10.000,-0.000},
				{-51.323,-236.874,10.000,-0.000},
				{-78.958,-315.832,10.000,-0.000},
				{-115.053,-406.070,10.000,-0.000},
				{-160.736,-507.587,10.000,-0.000},
				{-217.134,-620.384,10.000,-0.000},
				{-285.377,-744.461,10.000,-0.000},
				{-366.591,-879.817,10.000,-0.000},
				{-461.904,-1026.454,10.000,-0.000},
				{-572.445,-1184.369,10.000,-0.001},
				{-698.778,-1342.285,10.000,-0.001},
				{-840.902,-1500.201,10.000,-0.001},
				{-998.818,-1658.117,10.000,-0.002},
				{-1172.526,-1816.033,10.000,-0.003},
				{-1362.025,-1973.949,10.000,-0.003},
				{-1567.316,-2131.865,10.000,-0.005},
				{-1788.398,-2289.781,10.000,-0.006},
				{-2025.272,-2447.697,10.000,-0.008},
				{-2277.937,-2605.613,10.000,-0.010},
				{-2546.394,-2763.529,10.000,-0.012},
				{-2830.643,-2921.445,10.000,-0.015},
				{-3130.683,-3079.361,10.000,-0.018},
				{-3446.515,-3237.277,10.000,-0.022},
				{-3778.139,-3395.192,10.000,-0.026},
				{-4125.554,-3553.108,10.000,-0.031},
				{-4488.760,-3711.024,10.000,-0.037},
				{-4867.758,-3868.940,10.000,-0.043},
				{-5262.548,-4026.856,10.000,-0.050},
				{-5673.130,-4184.772,10.000,-0.058},
				{-6099.503,-4342.688,10.000,-0.066},
				{-6541.667,-4500.604,10.000,-0.076},
				{-6999.624,-4658.520,10.000,-0.087},
				{-7473.371,-4816.436,10.000,-0.098},
				{-7962.911,-4974.352,10.000,-0.111},
				{-8468.242,-5132.268,10.000,-0.125},
				{-8989.364,-5290.184,10.000,-0.140},
				{-9526.278,-5448.100,10.000,-0.156},
				{-10078.984,-5606.015,10.000,-0.174},
				{-10647.481,-5763.931,10.000,-0.193},
				{-11231.770,-5921.847,10.000,-0.214},
				{-11831.851,-6079.763,10.000,-0.236},
				{-12447.723,-6237.679,10.000,-0.259},
				{-13079.387,-6395.595,10.000,-0.284},
				{-13726.842,-6553.511,10.000,-0.311},
				{-14390.089,-6711.427,10.000,-0.340},
				{-15069.127,-6869.343,10.000,-0.370},
				{-15763.958,-7027.259,10.000,-0.402},
				{-16474.579,-7185.175,10.000,-0.436},
				{-17200.992,-7343.091,10.000,-0.471},
				{-17943.197,-7501.007,10.000,-0.509},
				{-18701.194,-7658.923,10.000,-0.548},
				{-19474.982,-7816.838,10.000,-0.590},
				{-20264.561,-7974.754,10.000,-0.633},
				{-21069.933,-8132.670,10.000,-0.679},
				{-21891.096,-8290.586,10.000,-0.726},
				{-22728.050,-8448.502,10.000,-0.776},
				{-23580.796,-8606.418,10.000,-0.828},
				{-24449.334,-8764.334,10.000,-0.882},
				{-25333.663,-8922.250,10.000,-0.937},
				{-26233.784,-9080.166,10.000,-0.995},
				{-27149.696,-9238.082,10.000,-1.055},
				{-28081.400,-9395.998,10.000,-1.118},
				{-29028.896,-9553.914,10.000,-1.182},
				{-29992.183,-9711.830,10.000,-1.248},
				{-30971.261,-9869.746,10.000,-1.316},
				{-31966.132,-10027.661,10.000,-1.387},
				{-32976.794,-10185.577,10.000,-1.459},
				{-34003.247,-10343.493,10.000,-1.533},
				{-35045.492,-10501.409,10.000,-1.609},
				{-36103.529,-10659.325,10.000,-1.687},
				{-37177.357,-10817.241,10.000,-1.766},
				{-38266.977,-10975.157,10.000,-1.848},
				{-39372.389,-11133.073,10.000,-1.931},
				{-40493.592,-11290.989,10.000,-2.015},
				{-41630.587,-11448.905,10.000,-2.101},
				{-42783.373,-11606.821,10.000,-2.189},
				{-43951.951,-11764.737,10.000,-2.277},
				{-45136.320,-11922.653,10.000,-2.367},
				{-46336.481,-12080.569,10.000,-2.458},
				{-47552.434,-12238.484,10.000,-2.550},
				{-48784.178,-12396.400,10.000,-2.643},
				{-50031.714,-12554.316,10.000,-2.736},
				{-51295.041,-12712.232,10.000,-2.831},
				{-52574.160,-12870.148,10.000,-2.925},
				{-53869.071,-13028.064,10.000,-3.020},
				{-55179.773,-13185.980,10.000,-3.115},
				{-56506.267,-13343.896,10.000,-3.210},
				{-57848.552,-13501.812,10.000,-3.305},
				{-59206.629,-13659.728,10.000,-3.400},
				{-60580.498,-13817.644,10.000,-3.494},
				{-61970.158,-13975.560,10.000,-3.587},
				{-63375.610,-14133.476,10.000,-3.680},
				{-64796.853,-14291.392,10.000,-3.771},
				{-66233.888,-14449.307,10.000,-3.861},
				{-67686.715,-14607.223,10.000,-3.950},
				{-69155.333,-14765.139,10.000,-4.037},
				{-70639.743,-14923.055,10.000,-4.123},
				{-72139.944,-15080.971,10.000,-4.206},
				{-73655.937,-15238.887,10.000,-4.287},
				{-75187.721,-15396.803,10.000,-4.366},
				{-76735.297,-15554.719,10.000,-4.441},
				{-78298.665,-15712.635,10.000,-4.514},
				{-79877.824,-15870.551,10.000,-4.584},
				{-81472.775,-16028.467,10.000,-4.651},
				{-83083.518,-16186.383,10.000,-4.714},
				{-84710.052,-16344.299,10.000,-4.773},
				{-86352.377,-16502.214,10.000,-4.828},
				{-88010.495,-16660.130,10.000,-4.879},
				{-89684.404,-16818.046,10.000,-4.925},
				{-91374.104,-16975.962,10.000,-4.967},
				{-93079.596,-17133.878,10.000,-5.004},
				{-94800.880,-17291.794,10.000,-5.036},
				{-96537.955,-17449.710,10.000,-5.062},
				{-98290.822,-17607.626,10.000,-5.084},
				{-100059.480,-17765.542,10.000,-5.099},
				{-101843.930,-17923.458,10.000,-5.109},
				{-103644.172,-18081.374,10.000,-5.112},
				{-105460.205,-18239.290,10.000,-5.110},
				{-107292.030,-18397.206,10.000,-5.101},
				{-109139.646,-18555.122,10.000,-5.085},
				{-111003.054,-18713.037,10.000,-5.063},
				{-112881.689,-18859.674,10.000,-5.034},
				{-114774.425,-18995.030,10.000,-4.999},
				{-116680.131,-19119.107,10.000,-4.956},
				{-118597.682,-19231.904,10.000,-4.907},
				{-120525.948,-19333.421,10.000,-4.851},
				{-122463.802,-19423.659,10.000,-4.788},
				{-124410.116,-19502.617,10.000,-4.718},
				{-126363.762,-19570.295,10.000,-4.641},
				{-128323.611,-19626.694,10.000,-4.558},
				{-130288.537,-19671.813,10.000,-4.469},
				{-132257.410,-19705.652,10.000,-4.373},
				{-134229.103,-19728.211,10.000,-4.272},
				{-136202.488,-19739.491,10.000,-4.165},
				{-138176.437,-19739.491,10.000,-4.053},
				{-140150.386,-19739.491,10.000,-3.936},
				{-142124.335,-19739.491,10.000,-3.814},
				{-144098.285,-19739.491,10.000,-3.688},
				{-146072.234,-19739.491,10.000,-3.558},
				{-148046.183,-19739.491,10.000,-3.424},
				{-150020.132,-19739.491,10.000,-3.286},
				{-151994.081,-19739.491,10.000,-3.146},
				{-153968.030,-19739.491,10.000,-3.003},
				{-155941.979,-19739.491,10.000,-2.858},
				{-157915.928,-19739.491,10.000,-2.710},
				{-159889.877,-19739.491,10.000,-2.562},
				{-161863.826,-19739.491,10.000,-2.413},
				{-163837.776,-19739.491,10.000,-2.263},
				{-165811.725,-19739.491,10.000,-2.113},
				{-167785.674,-19739.491,10.000,-1.964},
				{-169759.623,-19739.491,10.000,-1.816},
				{-171733.572,-19739.491,10.000,-1.669},
				{-173707.521,-19739.491,10.000,-1.525},
				{-175681.470,-19739.491,10.000,-1.383},
				{-177655.419,-19739.491,10.000,-1.245},
				{-179629.368,-19739.491,10.000,-1.110},
				{-181603.317,-19739.491,10.000,-0.980},
				{-183577.267,-19739.491,10.000,-0.855},
				{-185551.216,-19739.491,10.000,-0.736},
				{-187525.165,-19739.491,10.000,-0.623},
				{-189499.114,-19739.491,10.000,-0.517},
				{-191473.063,-19739.491,10.000,-0.419},
				{-193447.012,-19739.491,10.000,-0.329},
				{-195420.961,-19739.491,10.000,-0.249},
				{-197394.910,-19739.491,10.000,-0.178},
				{-199368.859,-19739.491,10.000,-0.118},
				{-201342.808,-19739.491,10.000,-0.070},
				{-203316.758,-19739.491,10.000,-0.033},
				{-205290.707,-19739.491,10.000,-0.010},
				{-207264.656,-19739.491,10.000,-0.000},
				{-209238.605,-19739.491,10.000,-0.009},
				{-211212.554,-19739.491,10.000,-0.043},
				{-213186.503,-19739.491,10.000,-0.102},
				{-215160.452,-19739.491,10.000,-0.185},
				{-217134.401,-19739.491,10.000,-0.293},
				{-219108.350,-19739.491,10.000,-0.424},
				{-221082.300,-19739.491,10.000,-0.580},
				{-223056.249,-19739.491,10.000,-0.760},
				{-225030.198,-19739.491,10.000,-0.964},
				{-227004.147,-19739.491,10.000,-1.193},
				{-228978.096,-19739.491,10.000,-1.446},
				{-230952.045,-19739.491,10.000,-1.725},
				{-232925.994,-19739.491,10.000,-2.029},
				{-234899.943,-19739.491,10.000,-2.360},
				{-236873.892,-19739.491,10.000,-2.718},
				{-238847.841,-19739.491,10.000,-3.104},
				{-240821.791,-19739.491,10.000,-3.519},
				{-242795.740,-19739.491,10.000,-3.963},
				{-244769.689,-19739.491,10.000,-4.439},
				{-246743.638,-19739.491,10.000,-4.946},
				{-248717.587,-19739.491,10.000,-5.487},
				{-250691.536,-19739.491,10.000,-6.063},
				{-252665.485,-19739.491,10.000,-6.675},
				{-254639.434,-19739.491,10.000,-7.325},
				{-256613.383,-19739.491,10.000,-8.015},
				{-258587.332,-19739.491,10.000,-8.746},
				{-260561.282,-19739.491,10.000,-9.521},
				{-262535.231,-19739.491,10.000,-10.342},
				{-264509.180,-19739.491,10.000,-11.211},
				{-266483.129,-19739.491,10.000,-12.129},
				{-268457.078,-19739.491,10.000,-13.100},
				{-270431.027,-19739.491,10.000,-14.126},
				{-272404.976,-19739.491,10.000,-15.208},
				{-274378.925,-19739.491,10.000,-16.349},
				{-276352.874,-19739.491,10.000,-17.551},
				{-278326.823,-19739.491,10.000,-18.817},
				{-280300.773,-19739.491,10.000,-20.147},
				{-282274.722,-19739.491,10.000,-21.542},
				{-284248.671,-19739.491,10.000,-23.005},
				{-286222.620,-19739.491,10.000,-24.535},
				{-288196.569,-19739.491,10.000,-26.131},
				{-290170.518,-19739.491,10.000,-27.792},
				{-292144.467,-19739.491,10.000,-29.517},
				{-294118.416,-19739.491,10.000,-31.301},
				{-296092.365,-19739.491,10.000,-33.141},
				{-298066.315,-19739.491,10.000,-35.032},
				{-300040.264,-19739.491,10.000,-36.965},
				{-302014.213,-19739.491,10.000,-38.935},
				{-303988.162,-19739.491,10.000,-40.933},
				{-305962.111,-19739.491,10.000,-42.948},
				{-307936.060,-19739.491,10.000,-44.972},
				{-309910.009,-19739.491,10.000,-46.994},
				{-311883.958,-19739.491,10.000,-49.004},
				{-313857.907,-19739.491,10.000,-50.992},
				{-315831.856,-19739.491,10.000,-52.950},
				{-317805.806,-19739.491,10.000,-54.868},
				{-319779.755,-19739.491,10.000,-56.740},
				{-321753.704,-19739.491,10.000,-58.559},
				{-323727.653,-19739.491,10.000,-60.320},
				{-325701.602,-19739.491,10.000,-62.019},
				{-327675.551,-19739.491,10.000,-63.653},
				{-329649.500,-19739.491,10.000,-65.220},
				{-331623.449,-19739.491,10.000,-66.719},
				{-333597.398,-19739.491,10.000,-68.150},
				{-335571.347,-19739.491,10.000,-69.513},
				{-337545.297,-19739.491,10.000,-70.810},
				{-339519.246,-19739.491,10.000,-72.041},
				{-341493.195,-19739.491,10.000,-73.209},
				{-343467.144,-19739.491,10.000,-74.316},
				{-345441.093,-19739.491,10.000,-75.363},
				{-347415.042,-19739.491,10.000,-76.354},
				{-349388.991,-19739.491,10.000,-77.290},
				{-351362.940,-19739.491,10.000,-78.175},
				{-353336.889,-19739.491,10.000,-79.010},
				{-355310.839,-19739.491,10.000,-79.797},
				{-357284.788,-19739.491,10.000,-80.540},
				{-359258.737,-19739.491,10.000,-81.241},
				{-361232.686,-19739.491,10.000,-81.900},
				{-363206.635,-19739.491,10.000,-82.522},
				{-365180.584,-19739.491,10.000,-83.106},
				{-367154.533,-19739.491,10.000,-83.656},
				{-369128.482,-19739.491,10.000,-84.173},
				{-371102.431,-19739.491,10.000,-84.658},
				{-373076.380,-19739.491,10.000,-85.114},
				{-375050.330,-19739.491,10.000,-85.541},
				{-377024.279,-19739.491,10.000,-85.941},
				{-378998.228,-19739.491,10.000,-86.316},
				{-380972.177,-19739.491,10.000,-86.666},
				{-382946.126,-19739.491,10.000,-86.992},
				{-384920.075,-19739.491,10.000,-87.297},
				{-386894.024,-19739.491,10.000,-87.580},
				{-388867.973,-19739.491,10.000,-87.843},
				{-390841.922,-19739.491,10.000,-88.086},
				{-392815.871,-19739.491,10.000,-88.311},
				{-394789.821,-19739.491,10.000,-88.518},
				{-396763.770,-19739.491,10.000,-88.709},
				{-398737.719,-19739.491,10.000,-88.883},
				{-400711.668,-19739.491,10.000,-89.042},
				{-402685.617,-19739.491,10.000,-89.185},
				{-404659.566,-19739.491,10.000,-89.315},
				{-406633.515,-19739.491,10.000,-89.432},
				{-408607.464,-19739.491,10.000,-89.535},
				{-410581.413,-19739.491,10.000,-89.626},
				{-412555.362,-19739.491,10.000,-89.706},
				{-414529.312,-19739.491,10.000,-89.774},
				{-416503.261,-19739.491,10.000,-89.832},
				{-418477.210,-19739.491,10.000,-89.880},
				{-420451.159,-19739.491,10.000,-89.919},
				{-422425.108,-19739.491,10.000,-89.948},
				{-424399.057,-19739.491,10.000,-89.970},
				{-426373.006,-19739.491,10.000,-89.983},
				{-428346.955,-19739.491,10.000,-89.989},
				{-430320.904,-19739.491,10.000,-89.990},
				{-432294.854,-19739.491,10.000,-89.991},
				{-434268.803,-19739.491,10.000,-89.992},
				{-436242.752,-19739.491,10.000,-89.993},
				{-438216.701,-19739.491,10.000,-89.994},
				{-440190.650,-19739.491,10.000,-89.996},
				{-442164.599,-19739.491,10.000,-89.998},
				{-444138.548,-19739.491,10.000,-89.999},
				{-446112.497,-19739.491,10.000,-90.001},
				{-448086.446,-19739.491,10.000,-90.003},
				{-450060.395,-19739.491,10.000,-90.004},
				{-452034.345,-19739.491,10.000,-90.006},
				{-454008.294,-19739.491,10.000,-90.007},
				{-455982.243,-19739.491,10.000,-90.008},
				{-457956.192,-19739.491,10.000,-90.008},
				{-459930.141,-19739.491,10.000,-90.009},
				{-461904.090,-19739.491,10.000,-90.009},
				{-463878.039,-19739.491,10.000,-90.009},
				{-465851.988,-19739.491,10.000,-90.008},
				{-467825.937,-19739.491,10.000,-90.007},
				{-469799.886,-19739.491,10.000,-90.007},
				{-471773.836,-19739.491,10.000,-90.005},
				{-473747.785,-19739.491,10.000,-90.004},
				{-475721.734,-19739.491,10.000,-90.003},
				{-477695.683,-19739.491,10.000,-90.001},
				{-479669.632,-19739.491,10.000,-89.999},
				{-481643.581,-19739.491,10.000,-89.997},
				{-483617.530,-19739.491,10.000,-89.996},
				{-485591.479,-19739.491,10.000,-89.994},
				{-487565.428,-19739.491,10.000,-89.993},
				{-489539.378,-19739.491,10.000,-89.991},
				{-491513.327,-19739.491,10.000,-89.991},
				{-493487.276,-19739.491,10.000,-89.990},
				{-495461.225,-19739.491,10.000,-89.984},
				{-497435.174,-19739.491,10.000,-89.944},
				{-499409.123,-19739.491,10.000,-89.866},
				{-501383.072,-19739.491,10.000,-89.752},
				{-503357.021,-19739.491,10.000,-89.602},
				{-505330.970,-19739.491,10.000,-89.416},
				{-507304.919,-19739.491,10.000,-89.194},
				{-509278.869,-19739.491,10.000,-88.936},
				{-511252.818,-19739.491,10.000,-88.640},
				{-513226.767,-19739.491,10.000,-88.307},
				{-515200.716,-19739.491,10.000,-87.935},
				{-517174.665,-19739.491,10.000,-87.522},
				{-519148.614,-19739.491,10.000,-87.068},
				{-521122.563,-19739.491,10.000,-86.571},
				{-523096.512,-19739.491,10.000,-86.028},
				{-525070.461,-19739.491,10.000,-85.437},
				{-527044.410,-19739.491,10.000,-84.795},
				{-529018.360,-19739.491,10.000,-84.101},
				{-530992.309,-19739.491,10.000,-83.349},
				{-532966.258,-19739.491,10.000,-82.538},
				{-534940.207,-19739.491,10.000,-81.663},
				{-536914.156,-19739.491,10.000,-80.720},
				{-538888.105,-19739.491,10.000,-79.704},
				{-540862.054,-19739.491,10.000,-78.610},
				{-542836.003,-19739.491,10.000,-77.434},
				{-544809.464,-19729.729,10.000,-76.170},
				{-546781.385,-19708.686,10.000,-74.814},
				{-548750.638,-19676.364,10.000,-73.362},
				{-550716.094,-19632.763,10.000,-71.808},
				{-552676.626,-19577.881,10.000,-70.151},
				{-554631.106,-19511.720,10.000,-68.388},
				{-556578.406,-19434.279,10.000,-66.518},
				{-558517.398,-19345.559,10.000,-64.541},
				{-560446.954,-19245.559,10.000,-62.462},
				{-562365.946,-19134.279,10.000,-60.284},
				{-564273.246,-19011.719,10.000,-58.018},
				{-566167.726,-18877.880,10.000,-55.673},
				{-568048.258,-18732.761,10.000,-53.264},
				{-569913.714,-18576.362,10.000,-50.807},
				{-571763.454,-18418.446,10.000,-48.322},
				{-573597.403,-18260.530,10.000,-45.827},
				{-575415.560,-18102.614,10.000,-43.340},
				{-577217.926,-17944.698,10.000,-40.881},
				{-579004.500,-17786.783,10.000,-38.469},
				{-580775.283,-17628.867,10.000,-36.117},
				{-582530.273,-17470.951,10.000,-33.841},
				{-584269.473,-17313.035,10.000,-31.651},
				{-585992.880,-17155.119,10.000,-29.556},
				{-587700.496,-16997.203,10.000,-27.561},
				{-589392.321,-16839.287,10.000,-25.669},
				{-591068.354,-16681.371,10.000,-23.882},
				{-592728.595,-16523.455,10.000,-22.199},
				{-594373.045,-16365.539,10.000,-20.618},
				{-596001.703,-16207.623,10.000,-19.136},
				{-597614.570,-16049.707,10.000,-17.749},
				{-599211.644,-15891.791,10.000,-16.452},
				{-600792.928,-15733.875,10.000,-15.242},
				{-602358.420,-15575.960,10.000,-14.113},
				{-603908.120,-15418.044,10.000,-13.060},
				{-605442.028,-15260.128,10.000,-12.079},
				{-606960.145,-15102.212,10.000,-11.166},
				{-608462.471,-14944.296,10.000,-10.315},
				{-609949.004,-14786.380,10.000,-9.523},
				{-611419.747,-14628.464,10.000,-8.786},
				{-612874.697,-14470.548,10.000,-8.100},
				{-614313.856,-14312.632,10.000,-7.462},
				{-615737.224,-14154.716,10.000,-6.868},
				{-617144.799,-13996.800,10.000,-6.315},
				{-618536.584,-13838.884,10.000,-5.802},
				{-619912.576,-13680.968,10.000,-5.324},
				{-621272.777,-13523.052,10.000,-4.880},
				{-622617.187,-13365.137,10.000,-4.467},
				{-623945.805,-13207.221,10.000,-4.084},
				{-625258.631,-13049.305,10.000,-3.728},
				{-626555.666,-12891.389,10.000,-3.397},
				{-627836.909,-12733.473,10.000,-3.091},
				{-629102.360,-12575.557,10.000,-2.807},
				{-630352.020,-12417.641,10.000,-2.544},
				{-631585.888,-12259.725,10.000,-2.300},
				{-632803.965,-12101.809,10.000,-2.075},
				{-634006.250,-11943.893,10.000,-1.867},
				{-635192.744,-11785.977,10.000,-1.675},
				{-636363.446,-11628.061,10.000,-1.498},
				{-637518.356,-11470.145,10.000,-1.336},
				{-638657.475,-11312.229,10.000,-1.186},
				{-639780.802,-11154.314,10.000,-1.049},
				{-640888.338,-10996.398,10.000,-0.923},
				{-641980.081,-10838.482,10.000,-0.808},
				{-643056.034,-10680.566,10.000,-0.703},
				{-644116.195,-10522.650,10.000,-0.608},
				{-645160.564,-10364.734,10.000,-0.521},
				{-646189.141,-10206.818,10.000,-0.443},
				{-647201.927,-10048.902,10.000,-0.372},
				{-648198.922,-9890.986,10.000,-0.308},
				{-649180.125,-9733.070,10.000,-0.251},
				{-650145.536,-9575.154,10.000,-0.200},
				{-651095.156,-9417.238,10.000,-0.154},
				{-652028.984,-9259.322,10.000,-0.114},
				{-652947.020,-9101.406,10.000,-0.078},
				{-653849.265,-8943.491,10.000,-0.047},
				{-654735.718,-8785.575,10.000,-0.020},
				{-655606.380,-8627.659,10.000,0.003},
				{-656461.250,-8469.743,10.000,0.023},
				{-657300.328,-8311.827,10.000,0.040},
				{-658123.615,-8153.911,10.000,0.054},
				{-658931.111,-7995.995,10.000,0.065},
				{-659722.814,-7838.079,10.000,0.074},
				{-660498.726,-7680.163,10.000,0.081},
				{-661258.847,-7522.247,10.000,0.086},
				{-662003.176,-7364.331,10.000,0.090},
				{-662731.713,-7206.415,10.000,0.092},
				{-663444.459,-7048.499,10.000,0.093},
				{-664141.413,-6890.584,10.000,0.092},
				{-664822.576,-6732.668,10.000,0.091},
				{-665487.947,-6574.752,10.000,0.089},
				{-666137.526,-6416.836,10.000,0.086},
				{-666771.314,-6258.920,10.000,0.083},
				{-667389.310,-6101.004,10.000,0.080},
				{-667991.514,-5943.088,10.000,0.076},
				{-668577.927,-5785.172,10.000,0.071},
				{-669148.549,-5627.256,10.000,0.067},
				{-669703.379,-5469.340,10.000,0.062},
				{-670242.417,-5311.424,10.000,0.058},
				{-670765.663,-5153.508,10.000,0.053},
				{-671273.119,-4995.592,10.000,0.049},
				{-671764.782,-4837.676,10.000,0.044},
				{-672240.654,-4679.761,10.000,0.040},
				{-672700.734,-4521.845,10.000,0.036},
				{-673145.023,-4363.929,10.000,0.032},
				{-673573.520,-4206.013,10.000,0.029},
				{-673986.225,-4048.097,10.000,0.025},
				{-674383.139,-3890.181,10.000,0.022},
				{-674764.261,-3732.265,10.000,0.019},
				{-675129.592,-3574.349,10.000,0.017},
				{-675479.131,-3416.433,10.000,0.014},
				{-675812.879,-3258.517,10.000,0.012},
				{-676130.835,-3100.601,10.000,0.010},
				{-676432.999,-2942.685,10.000,0.008},
				{-676719.372,-2784.769,10.000,0.007},
				{-676989.953,-2626.853,10.000,0.006},
				{-677244.742,-2468.938,10.000,0.005},
				{-677483.740,-2311.022,10.000,0.004},
				{-677706.947,-2153.106,10.000,0.003},
				{-677914.362,-1995.190,10.000,0.002},
				{-678105.985,-1837.274,10.000,0.002},
				{-678281.816,-1679.358,10.000,0.001},
				{-678441.856,-1521.442,10.000,0.001},
				{-678586.105,-1363.526,10.000,0.001},
				{-678714.561,-1205.610,10.000,0.000},
				{-678827.227,-1047.694,10.000,0.000},
				{-678924.588,-899.541,10.000,0.000},
				{-679007.699,-762.667,10.000,0.000},
				{-679077.686,-637.073,10.000,0.000},
				{-679135.677,-522.759,10.000,0.000},
				{-679182.802,-419.724,10.000,0.000},
				{-679220.186,-327.969,10.000,0.000},
				{-679248.959,-247.494,10.000,0.000},
				{-679270.249,-178.299,10.000,0.000},
				{-679285.183,-120.383,10.000,0.000},
				{-679294.890,-73.747,10.000,0.000},
				{-679300.497,-38.391,10.000,0.000},
				{-679303.132,-14.314,10.000,0.000},
				{-679303.923,-1.517,10.000,0.000},
				{-679303.999,-0.000,10.000,-0.000},
				{-679303.999,-0.000,10.000,-0.000}		};

}