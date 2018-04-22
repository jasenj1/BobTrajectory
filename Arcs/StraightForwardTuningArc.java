package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class StraightForwardTuningArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,3.79,0.00)
	// (20.21,3.79,0.00)
	
    public StraightForwardTuningArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public StraightForwardTuningArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.553,-11.056,10.000,0.000},
				{-2.764,-33.169,10.000,0.000},
				{-7.739,-66.337,10.000,0.000},
				{-16.584,-110.562,10.000,0.000},
				{-30.405,-165.843,10.000,0.000},
				{-50.306,-232.180,10.000,0.000},
				{-77.393,-309.574,10.000,0.000},
				{-112.773,-398.023,10.000,0.000},
				{-157.551,-497.529,10.000,0.000},
				{-212.832,-608.091,10.000,0.000},
				{-279.722,-729.709,10.000,0.000},
				{-359.327,-862.384,10.000,0.000},
				{-452.751,-1006.114,10.000,0.000},
				{-561.102,-1160.901,10.000,0.000},
				{-684.932,-1315.688,10.000,0.000},
				{-824.240,-1470.475,10.000,0.000},
				{-979.027,-1625.262,10.000,0.000},
				{-1149.292,-1780.048,10.000,0.000},
				{-1335.036,-1934.835,10.000,0.000},
				{-1536.259,-2089.622,10.000,0.000},
				{-1752.961,-2244.409,10.000,0.000},
				{-1985.141,-2399.196,10.000,0.000},
				{-2232.800,-2553.982,10.000,0.000},
				{-2495.937,-2708.769,10.000,0.000},
				{-2774.554,-2863.556,10.000,0.000},
				{-3068.649,-3018.343,10.000,0.000},
				{-3378.222,-3173.130,10.000,0.000},
				{-3703.275,-3327.917,10.000,0.000},
				{-4043.806,-3482.703,10.000,0.000},
				{-4399.815,-3637.490,10.000,0.000},
				{-4771.304,-3792.277,10.000,0.000},
				{-5158.271,-3947.064,10.000,0.000},
				{-5560.716,-4101.851,10.000,0.000},
				{-5978.641,-4256.637,10.000,0.000},
				{-6412.044,-4411.424,10.000,0.000},
				{-6860.926,-4566.211,10.000,0.000},
				{-7325.286,-4720.998,10.000,0.000},
				{-7805.125,-4875.785,10.000,0.000},
				{-8300.443,-5030.571,10.000,0.000},
				{-8811.239,-5185.358,10.000,0.000},
				{-9337.515,-5340.145,10.000,0.000},
				{-9879.268,-5494.932,10.000,0.000},
				{-10436.501,-5649.719,10.000,0.000},
				{-11009.212,-5804.506,10.000,0.000},
				{-11597.402,-5959.292,10.000,0.000},
				{-12201.071,-6114.079,10.000,0.000},
				{-12820.218,-6268.866,10.000,0.000},
				{-13454.844,-6423.653,10.000,0.000},
				{-14104.948,-6578.440,10.000,0.000},
				{-14770.532,-6733.226,10.000,0.000},
				{-15451.594,-6888.013,10.000,0.000},
				{-16148.134,-7042.800,10.000,0.000},
				{-16860.154,-7197.587,10.000,0.000},
				{-17587.652,-7352.374,10.000,0.000},
				{-18330.629,-7507.161,10.000,0.000},
				{-19089.084,-7661.947,10.000,0.000},
				{-19863.018,-7816.734,10.000,0.000},
				{-20652.431,-7971.521,10.000,0.000},
				{-21457.322,-8126.308,10.000,0.000},
				{-22277.692,-8281.095,10.000,0.000},
				{-23113.541,-8435.881,10.000,0.000},
				{-23964.869,-8590.668,10.000,0.000},
				{-24831.675,-8745.455,10.000,0.000},
				{-25713.960,-8900.242,10.000,0.000},
				{-26611.723,-9055.029,10.000,0.000},
				{-27524.965,-9209.815,10.000,0.000},
				{-28453.686,-9364.602,10.000,0.000},
				{-29397.886,-9519.389,10.000,0.000},
				{-30357.564,-9674.176,10.000,0.000},
				{-31332.721,-9828.963,10.000,0.000},
				{-32323.357,-9983.750,10.000,0.000},
				{-33329.471,-10138.536,10.000,0.000},
				{-34351.064,-10293.323,10.000,0.000},
				{-35388.136,-10448.110,10.000,0.000},
				{-36440.686,-10602.897,10.000,0.000},
				{-37508.162,-10746.627,10.000,0.000},
				{-38589.459,-10879.302,10.000,0.000},
				{-39683.470,-11000.920,10.000,0.000},
				{-40789.090,-11111.482,10.000,0.000},
				{-41905.213,-11210.988,10.000,0.000},
				{-43030.734,-11299.437,10.000,0.000},
				{-44164.548,-11376.831,10.000,0.000},
				{-45305.548,-11443.168,10.000,0.000},
				{-46452.629,-11498.449,10.000,0.000},
				{-47604.685,-11542.674,10.000,0.000},
				{-48760.611,-11575.843,10.000,0.000},
				{-49919.301,-11597.955,10.000,0.000},
				{-51079.649,-11609.011,10.000,0.000},
				{-52240.550,-11609.011,10.000,0.000},
				{-53401.451,-11609.011,10.000,0.000},
				{-54562.352,-11609.011,10.000,0.000},
				{-55723.253,-11609.011,10.000,0.000},
				{-56884.154,-11609.011,10.000,0.000},
				{-58045.056,-11609.011,10.000,0.000},
				{-59205.957,-11609.011,10.000,0.000},
				{-60366.858,-11609.011,10.000,0.000},
				{-61527.759,-11609.011,10.000,0.000},
				{-62688.660,-11609.011,10.000,0.000},
				{-63849.561,-11609.011,10.000,0.000},
				{-65010.462,-11609.011,10.000,0.000},
				{-66171.363,-11609.011,10.000,0.000},
				{-67332.264,-11609.011,10.000,0.000},
				{-68493.166,-11609.011,10.000,0.000},
				{-69654.067,-11609.011,10.000,0.000},
				{-70814.968,-11609.011,10.000,0.000},
				{-71975.869,-11609.011,10.000,0.000},
				{-73136.770,-11609.011,10.000,0.000},
				{-74297.671,-11609.011,10.000,0.000},
				{-75458.572,-11609.011,10.000,0.000},
				{-76619.473,-11609.011,10.000,0.000},
				{-77780.374,-11609.011,10.000,0.000},
				{-78941.276,-11609.011,10.000,0.000},
				{-80102.177,-11609.011,10.000,0.000},
				{-81263.078,-11609.011,10.000,0.000},
				{-82423.979,-11609.011,10.000,0.000},
				{-83584.880,-11609.011,10.000,0.000},
				{-84745.781,-11609.011,10.000,0.000},
				{-85906.682,-11609.011,10.000,0.000},
				{-87067.583,-11609.011,10.000,0.000},
				{-88228.484,-11609.011,10.000,0.000},
				{-89389.386,-11609.011,10.000,0.000},
				{-90550.287,-11609.011,10.000,0.000},
				{-91711.188,-11609.011,10.000,0.000},
				{-92872.089,-11609.011,10.000,0.000},
				{-94032.990,-11609.011,10.000,0.000},
				{-95193.891,-11609.011,10.000,0.000},
				{-96354.792,-11609.011,10.000,0.000},
				{-97515.693,-11609.011,10.000,0.000},
				{-98676.594,-11609.011,10.000,0.000},
				{-99837.495,-11609.011,10.000,0.000},
				{-100998.397,-11609.011,10.000,0.000},
				{-102159.298,-11609.011,10.000,0.000},
				{-103320.199,-11609.011,10.000,0.000},
				{-104481.100,-11609.011,10.000,0.000},
				{-105642.001,-11609.011,10.000,0.000},
				{-106802.902,-11609.011,10.000,0.000},
				{-107963.803,-11609.011,10.000,0.000},
				{-109124.704,-11609.011,10.000,0.000},
				{-110285.605,-11609.011,10.000,0.000},
				{-111446.507,-11609.011,10.000,0.000},
				{-112607.408,-11609.011,10.000,0.000},
				{-113768.309,-11609.011,10.000,0.000},
				{-114929.210,-11609.011,10.000,0.000},
				{-116090.111,-11609.011,10.000,0.000},
				{-117251.012,-11609.011,10.000,0.000},
				{-118411.913,-11609.011,10.000,0.000},
				{-119572.814,-11609.011,10.000,0.000},
				{-120733.715,-11609.011,10.000,0.000},
				{-121894.617,-11609.011,10.000,0.000},
				{-123055.518,-11609.011,10.000,0.000},
				{-124216.419,-11609.011,10.000,0.000},
				{-125377.320,-11609.011,10.000,0.000},
				{-126538.221,-11609.011,10.000,0.000},
				{-127699.122,-11609.011,10.000,0.000},
				{-128860.023,-11609.011,10.000,0.000},
				{-130020.924,-11609.011,10.000,0.000},
				{-131181.825,-11609.011,10.000,0.000},
				{-132342.727,-11609.011,10.000,0.000},
				{-133503.628,-11609.011,10.000,0.000},
				{-134664.529,-11609.011,10.000,0.000},
				{-135825.430,-11609.011,10.000,0.000},
				{-136986.331,-11609.011,10.000,0.000},
				{-138147.232,-11609.011,10.000,0.000},
				{-139308.133,-11609.011,10.000,0.000},
				{-140469.034,-11609.011,10.000,0.000},
				{-141629.935,-11609.011,10.000,0.000},
				{-142790.837,-11609.011,10.000,0.000},
				{-143951.738,-11609.011,10.000,0.000},
				{-145112.639,-11609.011,10.000,0.000},
				{-146273.540,-11609.011,10.000,0.000},
				{-147434.441,-11609.011,10.000,0.000},
				{-148595.342,-11609.011,10.000,0.000},
				{-149756.243,-11609.011,10.000,0.000},
				{-150917.144,-11609.011,10.000,0.000},
				{-152078.045,-11609.011,10.000,0.000},
				{-153238.947,-11609.011,10.000,0.000},
				{-154399.848,-11609.011,10.000,0.000},
				{-155560.749,-11609.011,10.000,0.000},
				{-156721.650,-11609.011,10.000,0.000},
				{-157882.551,-11609.011,10.000,0.000},
				{-159043.452,-11609.011,10.000,0.000},
				{-160204.353,-11609.011,10.000,0.000},
				{-161365.254,-11609.011,10.000,0.000},
				{-162526.155,-11609.011,10.000,0.000},
				{-163687.057,-11609.011,10.000,0.000},
				{-164847.958,-11609.011,10.000,0.000},
				{-166008.859,-11609.011,10.000,0.000},
				{-167169.760,-11609.011,10.000,0.000},
				{-168330.661,-11609.011,10.000,0.000},
				{-169491.562,-11609.011,10.000,0.000},
				{-170652.463,-11609.011,10.000,0.000},
				{-171813.364,-11609.011,10.000,0.000},
				{-172974.265,-11609.011,10.000,0.000},
				{-174135.167,-11609.011,10.000,0.000},
				{-175296.068,-11609.011,10.000,0.000},
				{-176456.969,-11609.011,10.000,0.000},
				{-177617.870,-11609.011,10.000,0.000},
				{-178778.771,-11609.011,10.000,0.000},
				{-179939.672,-11609.011,10.000,0.000},
				{-181100.573,-11609.011,10.000,0.000},
				{-182261.474,-11609.011,10.000,0.000},
				{-183422.375,-11609.011,10.000,0.000},
				{-184583.277,-11609.011,10.000,0.000},
				{-185744.178,-11609.011,10.000,0.000},
				{-186905.079,-11609.011,10.000,0.000},
				{-188065.980,-11609.011,10.000,0.000},
				{-189226.881,-11609.011,10.000,0.000},
				{-190387.782,-11609.011,10.000,0.000},
				{-191548.683,-11609.011,10.000,0.000},
				{-192709.584,-11609.011,10.000,0.000},
				{-193870.485,-11609.011,10.000,0.000},
				{-195031.387,-11609.011,10.000,0.000},
				{-196192.288,-11609.011,10.000,0.000},
				{-197353.189,-11609.011,10.000,0.000},
				{-198514.090,-11609.011,10.000,0.000},
				{-199674.991,-11609.011,10.000,0.000},
				{-200835.892,-11609.011,10.000,0.000},
				{-201996.793,-11609.011,10.000,0.000},
				{-203157.694,-11609.011,10.000,0.000},
				{-204318.595,-11609.011,10.000,0.000},
				{-205479.497,-11609.011,10.000,0.000},
				{-206640.398,-11609.011,10.000,0.000},
				{-207801.299,-11609.011,10.000,0.000},
				{-208962.200,-11609.011,10.000,0.000},
				{-210123.101,-11609.011,10.000,0.000},
				{-211284.002,-11609.011,10.000,0.000},
				{-212444.903,-11609.011,10.000,0.000},
				{-213605.804,-11609.011,10.000,0.000},
				{-214766.705,-11609.011,10.000,0.000},
				{-215927.607,-11609.011,10.000,0.000},
				{-217088.508,-11609.011,10.000,0.000},
				{-218249.409,-11609.011,10.000,0.000},
				{-219410.310,-11609.011,10.000,0.000},
				{-220571.211,-11609.011,10.000,0.000},
				{-221732.112,-11609.011,10.000,0.000},
				{-222893.013,-11609.011,10.000,0.000},
				{-224053.914,-11609.011,10.000,0.000},
				{-225214.815,-11609.011,10.000,0.000},
				{-226375.717,-11609.011,10.000,0.000},
				{-227536.618,-11609.011,10.000,0.000},
				{-228697.519,-11609.011,10.000,0.000},
				{-229858.420,-11609.011,10.000,0.000},
				{-231019.321,-11609.011,10.000,0.000},
				{-232180.222,-11609.011,10.000,0.000},
				{-233341.123,-11609.011,10.000,0.000},
				{-234502.024,-11609.011,10.000,0.000},
				{-235662.925,-11609.011,10.000,0.000},
				{-236823.827,-11609.011,10.000,0.000},
				{-237984.728,-11609.011,10.000,0.000},
				{-239145.629,-11609.011,10.000,0.000},
				{-240306.530,-11609.011,10.000,0.000},
				{-241467.431,-11609.011,10.000,0.000},
				{-242628.332,-11609.011,10.000,0.000},
				{-243789.233,-11609.011,10.000,0.000},
				{-244950.134,-11609.011,10.000,0.000},
				{-246111.035,-11609.011,10.000,0.000},
				{-247271.937,-11609.011,10.000,0.000},
				{-248432.838,-11609.011,10.000,0.000},
				{-249593.739,-11609.011,10.000,0.000},
				{-250754.640,-11609.011,10.000,0.000},
				{-251915.541,-11609.011,10.000,0.000},
				{-253076.442,-11609.011,10.000,0.000},
				{-254237.343,-11609.011,10.000,0.000},
				{-255398.244,-11609.011,10.000,0.000},
				{-256559.145,-11609.011,10.000,0.000},
				{-257720.047,-11609.011,10.000,0.000},
				{-258880.948,-11609.011,10.000,0.000},
				{-260041.849,-11609.011,10.000,0.000},
				{-261202.750,-11609.011,10.000,0.000},
				{-262363.651,-11609.011,10.000,0.000},
				{-263524.552,-11609.011,10.000,0.000},
				{-264685.453,-11609.011,10.000,0.000},
				{-265846.354,-11609.011,10.000,0.000},
				{-267007.255,-11609.011,10.000,0.000},
				{-268168.157,-11609.011,10.000,0.000},
				{-269329.058,-11609.011,10.000,0.000},
				{-270489.959,-11609.011,10.000,0.000},
				{-271650.860,-11609.011,10.000,0.000},
				{-272811.761,-11609.011,10.000,0.000},
				{-273972.662,-11609.011,10.000,0.000},
				{-275133.563,-11609.011,10.000,0.000},
				{-276294.464,-11609.011,10.000,0.000},
				{-277455.365,-11609.011,10.000,0.000},
				{-278616.266,-11609.011,10.000,0.000},
				{-279777.168,-11609.011,10.000,0.000},
				{-280938.069,-11609.011,10.000,0.000},
				{-282098.970,-11609.011,10.000,0.000},
				{-283259.871,-11609.011,10.000,0.000},
				{-284420.772,-11609.011,10.000,0.000},
				{-285581.673,-11609.011,10.000,0.000},
				{-286742.574,-11609.011,10.000,0.000},
				{-287903.475,-11609.011,10.000,0.000},
				{-289064.376,-11609.011,10.000,0.000},
				{-290225.278,-11609.011,10.000,0.000},
				{-291386.179,-11609.011,10.000,0.000},
				{-292547.080,-11609.011,10.000,0.000},
				{-293707.981,-11609.011,10.000,0.000},
				{-294868.882,-11609.011,10.000,0.000},
				{-296029.783,-11609.011,10.000,0.000},
				{-297190.684,-11609.011,10.000,0.000},
				{-298351.585,-11609.011,10.000,0.000},
				{-299512.486,-11609.011,10.000,0.000},
				{-300673.388,-11609.011,10.000,0.000},
				{-301834.289,-11609.011,10.000,0.000},
				{-302995.190,-11609.011,10.000,0.000},
				{-304156.091,-11609.011,10.000,0.000},
				{-305316.992,-11609.011,10.000,0.000},
				{-306477.893,-11609.011,10.000,0.000},
				{-307638.794,-11609.011,10.000,0.000},
				{-308799.542,-11605.940,10.000,0.000},
				{-309959.429,-11591.813,10.000,0.000},
				{-311117.352,-11566.629,10.000,0.000},
				{-312272.202,-11530.389,10.000,0.000},
				{-313422.877,-11483.093,10.000,0.000},
				{-314568.268,-11424.741,10.000,0.000},
				{-315707.272,-11355.333,10.000,0.000},
				{-316838.782,-11274.868,10.000,0.000},
				{-317961.693,-11183.347,10.000,0.000},
				{-319074.899,-11080.770,10.000,0.000},
				{-320177.294,-10967.137,10.000,0.000},
				{-321267.773,-10842.448,10.000,0.000},
				{-322345.231,-10706.702,10.000,0.000},
				{-323408.561,-10559.900,10.000,0.000},
				{-324456.812,-10405.114,10.000,0.000},
				{-325489.584,-10250.327,10.000,0.000},
				{-326506.877,-10095.540,10.000,0.000},
				{-327508.692,-9940.753,10.000,0.000},
				{-328495.028,-9785.966,10.000,0.000},
				{-329465.885,-9631.180,10.000,0.000},
				{-330421.264,-9476.393,10.000,0.000},
				{-331361.164,-9321.606,10.000,0.000},
				{-332285.585,-9166.819,10.000,0.000},
				{-333194.527,-9012.032,10.000,0.000},
				{-334087.991,-8857.246,10.000,0.000},
				{-334965.976,-8702.459,10.000,0.000},
				{-335828.483,-8547.672,10.000,0.000},
				{-336675.511,-8392.885,10.000,0.000},
				{-337507.060,-8238.098,10.000,0.000},
				{-338323.130,-8083.311,10.000,0.000},
				{-339123.722,-7928.525,10.000,0.000},
				{-339908.835,-7773.738,10.000,0.000},
				{-340678.470,-7618.951,10.000,0.000},
				{-341432.626,-7464.164,10.000,0.000},
				{-342171.303,-7309.377,10.000,0.000},
				{-342894.501,-7154.591,10.000,0.000},
				{-343602.221,-6999.804,10.000,0.000},
				{-344294.462,-6845.017,10.000,0.000},
				{-344971.224,-6690.230,10.000,0.000},
				{-345632.508,-6535.443,10.000,0.000},
				{-346278.313,-6380.656,10.000,0.000},
				{-346908.639,-6225.870,10.000,0.000},
				{-347523.487,-6071.083,10.000,0.000},
				{-348122.856,-5916.296,10.000,0.000},
				{-348706.746,-5761.509,10.000,0.000},
				{-349275.158,-5606.722,10.000,0.000},
				{-349828.090,-5451.936,10.000,0.000},
				{-350365.545,-5297.149,10.000,0.000},
				{-350887.520,-5142.362,10.000,0.000},
				{-351394.017,-4987.575,10.000,0.000},
				{-351885.035,-4832.788,10.000,0.000},
				{-352360.575,-4678.002,10.000,0.000},
				{-352820.636,-4523.215,10.000,0.000},
				{-353265.218,-4368.428,10.000,0.000},
				{-353694.321,-4213.641,10.000,0.000},
				{-354107.946,-4058.854,10.000,0.000},
				{-354506.092,-3904.067,10.000,0.000},
				{-354888.759,-3749.281,10.000,0.000},
				{-355255.948,-3594.494,10.000,0.000},
				{-355607.658,-3439.707,10.000,0.000},
				{-355943.889,-3284.920,10.000,0.000},
				{-356264.642,-3130.133,10.000,0.000},
				{-356569.916,-2975.347,10.000,0.000},
				{-356859.711,-2820.560,10.000,0.000},
				{-357134.028,-2665.773,10.000,0.000},
				{-357392.866,-2510.986,10.000,0.000},
				{-357636.225,-2356.199,10.000,0.000},
				{-357864.106,-2201.412,10.000,0.000},
				{-358076.508,-2046.626,10.000,0.000},
				{-358273.431,-1891.839,10.000,0.000},
				{-358454.876,-1737.052,10.000,0.000},
				{-358620.841,-1582.265,10.000,0.000},
				{-358771.329,-1427.478,10.000,0.000},
				{-358906.337,-1272.692,10.000,0.000},
				{-359025.867,-1117.905,10.000,0.000},
				{-359130.072,-966.189,10.000,0.000},
				{-359219.658,-825.530,10.000,0.000},
				{-359295.730,-695.926,10.000,0.000},
				{-359359.396,-577.379,10.000,0.000},
				{-359411.759,-469.889,10.000,0.000},
				{-359453.926,-373.454,10.000,0.000},
				{-359487.003,-288.075,10.000,0.000},
				{-359512.094,-213.753,10.000,0.000},
				{-359530.306,-150.487,10.000,0.000},
				{-359542.744,-98.277,10.000,0.000},
				{-359550.514,-57.124,10.000,0.000},
				{-359554.722,-27.026,10.000,0.000},
				{-359556.472,-7.985,10.000,0.000},
				{-359556.872,-0.000,10.000,0.000},
				{-359556.872,-0.000,10.000,0.000}		};

}