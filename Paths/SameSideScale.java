package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideScale extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.75,0.00,0.00)
	// (16.67,0.00,0.00)
	// (23.33,-1.25,-25.00)
	
	public SameSideScale() {
		this(false);
	}
			
    public SameSideScale(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.014,0.271,10.000},
				{0.068,0.541,10.000},
				{0.189,1.218,10.000},
				{0.406,2.165,10.000},
				{0.744,3.383,10.000},
				{1.231,4.871,10.000},
				{1.894,6.630,10.000},
				{2.760,8.659,10.000},
				{3.856,10.959,10.000},
				{5.196,13.395,10.000},
				{6.779,15.830,10.000},
				{8.605,18.266,10.000},
				{10.675,20.701,10.000},
				{12.989,23.136,10.000},
				{15.546,25.572,10.000},
				{18.347,28.007,10.000},
				{21.391,30.443,10.000},
				{24.679,32.878,10.000},
				{28.210,35.314,10.000},
				{31.985,37.749,10.000},
				{36.004,40.184,10.000},
				{40.266,42.620,10.000},
				{44.771,45.055,10.000},
				{49.520,47.491,10.000},
				{54.513,49.926,10.000},
				{59.749,52.361,10.000},
				{65.229,54.797,10.000},
				{70.952,57.232,10.000},
				{76.919,59.668,10.000},
				{83.129,62.103,10.000},
				{89.583,64.539,10.000},
				{96.280,66.974,10.000},
				{103.221,69.409,10.000},
				{110.406,71.845,10.000},
				{117.834,74.280,10.000},
				{125.505,76.716,10.000},
				{133.420,79.151,10.000},
				{141.579,81.586,10.000},
				{149.981,84.022,10.000},
				{158.627,86.457,10.000},
				{167.516,88.893,10.000},
				{176.649,91.328,10.000},
				{186.025,93.764,10.000},
				{195.645,96.199,10.000},
				{205.509,98.634,10.000},
				{215.616,101.070,10.000},
				{225.966,103.505,10.000},
				{236.560,105.941,10.000},
				{247.398,108.376,10.000},
				{258.479,110.811,10.000},
				{269.804,113.247,10.000},
				{281.372,115.682,10.000},
				{293.184,118.118,10.000},
				{305.239,120.553,10.000},
				{317.538,122.989,10.000},
				{330.080,125.424,10.000},
				{342.866,127.859,10.000},
				{355.895,130.295,10.000},
				{369.169,132.730,10.000},
				{382.685,135.166,10.000},
				{396.445,137.601,10.000},
				{410.449,140.036,10.000},
				{424.696,142.472,10.000},
				{439.187,144.907,10.000},
				{453.921,147.343,10.000},
				{468.899,149.778,10.000},
				{484.120,152.214,10.000},
				{499.585,154.649,10.000},
				{515.293,157.084,10.000},
				{531.245,159.520,10.000},
				{547.441,161.955,10.000},
				{563.880,164.391,10.000},
				{580.563,166.826,10.000},
				{597.489,169.261,10.000},
				{614.658,171.697,10.000},
				{632.072,174.132,10.000},
				{649.728,176.568,10.000},
				{667.629,179.003,10.000},
				{685.773,181.439,10.000},
				{704.160,183.874,10.000},
				{722.791,186.309,10.000},
				{741.665,188.745,10.000},
				{760.783,191.180,10.000},
				{780.145,193.616,10.000},
				{799.750,196.051,10.000},
				{819.599,198.486,10.000},
				{839.691,200.922,10.000},
				{860.027,203.357,10.000},
				{880.606,205.793,10.000},
				{901.429,208.228,10.000},
				{922.495,210.664,10.000},
				{943.805,213.099,10.000},
				{965.358,215.534,10.000},
				{987.155,217.970,10.000},
				{1009.196,220.405,10.000},
				{1031.480,222.841,10.000},
				{1054.008,225.276,10.000},
				{1076.779,227.711,10.000},
				{1099.793,230.147,10.000},
				{1123.052,232.582,10.000},
				{1146.553,235.018,10.000},
				{1170.299,237.453,10.000},
				{1194.288,239.889,10.000},
				{1218.520,242.324,10.000},
				{1242.996,244.759,10.000},
				{1267.715,247.195,10.000},
				{1292.678,249.630,10.000},
				{1317.885,252.066,10.000},
				{1343.335,254.501,10.000},
				{1369.029,256.936,10.000},
				{1394.966,259.372,10.000},
				{1421.147,261.807,10.000},
				{1447.571,264.243,10.000},
				{1474.239,266.678,10.000},
				{1501.150,269.113,10.000},
				{1528.305,271.549,10.000},
				{1555.703,273.984,10.000},
				{1583.345,276.420,10.000},
				{1611.231,278.855,10.000},
				{1639.360,281.291,10.000},
				{1667.732,283.726,10.000},
				{1696.349,286.161,10.000},
				{1725.208,288.597,10.000},
				{1754.312,291.032,10.000},
				{1783.658,293.468,10.000},
				{1813.249,295.903,10.000},
				{1843.082,298.338,10.000},
				{1873.160,300.774,10.000},
				{1903.481,303.209,10.000},
				{1934.045,305.645,10.000},
				{1964.853,308.080,10.000},
				{1995.905,310.516,10.000},
				{2027.200,312.951,10.000},
				{2058.739,315.386,10.000},
				{2090.521,317.822,10.000},
				{2122.546,320.257,10.000},
				{2154.816,322.693,10.000},
				{2187.329,325.128,10.000},
				{2220.085,327.563,10.000},
				{2253.085,329.999,10.000},
				{2286.328,332.434,10.000},
				{2319.815,334.870,10.000},
				{2353.546,337.305,10.000},
				{2387.520,339.741,10.000},
				{2421.737,342.176,10.000},
				{2456.198,344.611,10.000},
				{2490.903,347.047,10.000},
				{2525.851,349.482,10.000},
				{2561.043,351.918,10.000},
				{2596.478,354.353,10.000},
				{2632.157,356.788,10.000},
				{2668.080,359.224,10.000},
				{2704.246,361.659,10.000},
				{2740.655,364.095,10.000},
				{2777.308,366.530,10.000},
				{2814.205,368.966,10.000},
				{2851.345,371.401,10.000},
				{2888.728,373.836,10.000},
				{2926.356,376.272,10.000},
				{2964.226,378.707,10.000},
				{3002.341,381.143,10.000},
				{3040.698,383.578,10.000},
				{3079.300,386.013,10.000},
				{3118.145,388.449,10.000},
				{3157.233,390.884,10.000},
				{3196.565,393.320,10.000},
				{3236.141,395.755,10.000},
				{3275.960,398.191,10.000},
				{3316.022,400.626,10.000},
				{3356.328,403.061,10.000},
				{3396.878,405.497,10.000},
				{3437.671,407.932,10.000},
				{3478.708,410.368,10.000},
				{3519.988,412.803,10.000},
				{3561.512,415.238,10.000},
				{3603.280,417.674,10.000},
				{3645.290,420.109,10.000},
				{3687.545,422.545,10.000},
				{3730.043,424.980,10.000},
				{3772.785,427.416,10.000},
				{3815.770,429.851,10.000},
				{3858.998,432.286,10.000},
				{3902.470,434.722,10.000},
				{3946.186,437.157,10.000},
				{3990.145,439.593,10.000},
				{4034.348,442.028,10.000},
				{4078.795,444.463,10.000},
				{4123.484,446.899,10.000},
				{4168.418,449.334,10.000},
				{4213.595,451.770,10.000},
				{4259.015,454.205,10.000},
				{4304.679,456.641,10.000},
				{4350.587,459.076,10.000},
				{4396.738,461.511,10.000},
				{4443.133,463.947,10.000},
				{4489.771,466.382,10.000},
				{4536.653,468.818,10.000},
				{4583.778,471.253,10.000},
				{4631.147,473.688,10.000},
				{4678.759,476.124,10.000},
				{4726.602,478.424,10.000},
				{4774.647,480.454,10.000},
				{4822.868,482.212,10.000},
				{4871.238,483.701,10.000},
				{4919.730,484.918,10.000},
				{4968.317,485.866,10.000},
				{5016.971,486.542,10.000},
				{5065.666,486.948,10.000},
				{5114.362,486.959,10.000},
				{5163.019,486.574,10.000},
				{5211.611,485.919,10.000},
				{5260.111,484.994,10.000},
				{5308.490,483.798,10.000},
				{5356.723,482.331,10.000},
				{5404.783,480.594,10.000},
				{5452.641,478.586,10.000},
				{5500.272,476.307,10.000},
				{5547.660,473.883,10.000},
				{5594.805,471.447,10.000},
				{5641.706,469.012,10.000},
				{5688.364,466.576,10.000},
				{5734.778,464.141,10.000},
				{5780.949,461.706,10.000},
				{5826.876,459.270,10.000},
				{5872.559,456.835,10.000},
				{5917.999,454.399,10.000},
				{5963.195,451.964,10.000},
				{6008.148,449.528,10.000},
				{6052.857,447.093,10.000},
				{6097.323,444.658,10.000},
				{6141.545,442.222,10.000},
				{6185.524,439.787,10.000},
				{6229.259,437.351,10.000},
				{6272.751,434.916,10.000},
				{6315.999,432.481,10.000},
				{6359.003,430.045,10.000},
				{6401.764,427.610,10.000},
				{6444.282,425.174,10.000},
				{6486.556,422.739,10.000},
				{6528.586,420.303,10.000},
				{6570.373,417.868,10.000},
				{6611.916,415.433,10.000},
				{6653.216,412.997,10.000},
				{6694.272,410.562,10.000},
				{6735.085,408.126,10.000},
				{6775.654,405.691,10.000},
				{6815.992,403.382,10.000},
				{6856.137,401.448,10.000},
				{6896.096,399.588,10.000},
				{6935.873,397.776,10.000},
				{6975.474,396.008,10.000},
				{7014.902,394.280,10.000},
				{7054.161,392.588,10.000},
				{7093.254,390.927,10.000},
				{7132.183,389.294,10.000},
				{7170.951,387.685,10.000},
				{7209.561,386.098,10.000},
				{7248.014,384.528,10.000},
				{7286.311,382.973,10.000},
				{7324.454,381.429,10.000},
				{7362.444,379.895,10.000},
				{7400.280,378.366,10.000},
				{7437.964,376.842,10.000},
				{7475.496,375.319,10.000},
				{7512.876,373.795,10.000},
				{7550.103,372.268,10.000},
				{7587.176,370.735,10.000},
				{7624.096,369.196,10.000},
				{7660.860,367.647,10.000},
				{7697.469,366.087,10.000},
				{7733.921,364.515,10.000},
				{7770.213,362.928,10.000},
				{7806.346,361.325,10.000},
				{7842.316,359.704,10.000},
				{7878.123,358.065,10.000},
				{7913.763,356.404,10.000},
				{7949.235,354.722,10.000},
				{7984.537,353.017,10.000},
				{8019.666,351.287,10.000},
				{8054.619,349.532,10.000},
				{8089.394,347.750,10.000},
				{8123.988,345.940,10.000},
				{8158.398,344.102,10.000},
				{8192.621,342.234,10.000},
				{8226.655,340.336,10.000},
				{8260.496,338.406,10.000},
				{8294.140,336.445,10.000},
				{8327.585,334.452,10.000},
				{8360.828,332.426,10.000},
				{8393.865,330.366,10.000},
				{8426.692,328.273,10.000},
				{8459.306,326.146,10.000},
				{8491.705,323.985,10.000},
				{8523.884,321.790,10.000},
				{8555.840,319.560,10.000},
				{8587.570,317.296,10.000},
				{8619.069,314.998,10.000},
				{8650.336,312.667,10.000},
				{8681.366,310.302,10.000},
				{8712.157,307.903,10.000},
				{8742.704,305.472,10.000},
				{8773.005,303.009,10.000},
				{8803.056,300.514,10.000},
				{8832.855,297.988,10.000},
				{8862.398,295.432,10.000},
				{8891.683,292.846,10.000},
				{8920.706,290.231,10.000},
				{8949.465,287.589,10.000},
				{8977.957,284.920,10.000},
				{9006.179,282.225,10.000},
				{9034.129,279.504,10.000},
				{9061.805,276.760,10.000},
				{9089.205,273.993,10.000},
				{9116.325,271.204,10.000},
				{9143.165,268.394,10.000},
				{9169.721,265.565,10.000},
				{9195.993,262.717,10.000},
				{9221.978,259.852,10.000},
				{9247.675,256.970,10.000},
				{9273.082,254.073,10.000},
				{9298.198,251.162,10.000},
				{9323.022,248.238,10.000},
				{9347.552,245.302,10.000},
				{9371.788,242.355,10.000},
				{9395.728,239.399,10.000},
				{9419.371,236.433,10.000},
				{9442.717,233.460,10.000},
				{9465.765,230.481,10.000},
				{9488.515,227.495,10.000},
				{9510.965,224.505,10.000},
				{9533.116,221.510,10.000},
				{9554.967,218.513,10.000},
				{9576.519,215.514,10.000},
				{9597.770,212.513,10.000},
				{9618.721,209.511,10.000},
				{9639.372,206.510,10.000},
				{9659.723,203.510,10.000},
				{9679.774,200.511,10.000},
				{9699.526,197.515,10.000},
				{9718.978,194.521,10.000},
				{9738.131,191.531,10.000},
				{9756.986,188.546,10.000},
				{9775.542,185.565,10.000},
				{9793.801,182.589,10.000},
				{9811.763,179.619,10.000},
				{9829.428,176.655,10.000},
				{9846.798,173.698,10.000},
				{9863.873,170.748,10.000},
				{9880.654,167.805,10.000},
				{9897.141,164.871,10.000},
				{9913.335,161.944,10.000},
				{9929.238,159.026,10.000},
				{9944.849,156.117,10.000},
				{9960.171,153.216,10.000},
				{9975.203,150.326,10.000},
				{9989.948,147.444,10.000},
				{10004.405,144.573,10.000},
				{10018.576,141.711,10.000},
				{10032.462,138.860,10.000},
				{10046.064,136.019,10.000},
				{10059.383,133.188,10.000},
				{10072.420,130.368,10.000},
				{10085.176,127.559,10.000},
				{10097.652,124.761,10.000},
				{10109.849,121.973,10.000},
				{10121.769,119.196,10.000},
				{10133.412,116.431,10.000},
				{10144.779,113.676,10.000},
				{10155.873,110.932,10.000},
				{10166.693,108.200,10.000},
				{10177.240,105.478,10.000},
				{10187.517,102.767,10.000},
				{10197.524,100.067,10.000},
				{10207.262,97.378,10.000},
				{10216.732,94.700,10.000},
				{10225.935,92.032,10.000},
				{10234.872,89.375,10.000},
				{10243.545,86.729,10.000},
				{10251.954,84.092,10.000},
				{10260.101,81.466,10.000},
				{10267.986,78.850,10.000},
				{10275.611,76.244,10.000},
				{10282.975,73.648,10.000},
				{10290.081,71.061,10.000},
				{10296.930,68.484,10.000},
				{10303.521,65.915,10.000},
				{10309.857,63.356,10.000},
				{10315.937,60.805,10.000},
				{10321.764,58.262,10.000},
				{10327.336,55.728,10.000},
				{10332.657,53.202,10.000},
				{10337.725,50.683,10.000},
				{10342.542,48.172,10.000},
				{10347.109,45.667,10.000},
				{10351.426,43.170,10.000},
				{10355.494,40.678,10.000},
				{10359.313,38.193,10.000},
				{10362.884,35.714,10.000},
				{10366.208,33.240,10.000},
				{10369.285,30.771,10.000},
				{10372.116,28.307,10.000},
				{10374.701,25.848,10.000},
				{10377.040,23.392,10.000},
				{10379.134,20.940,10.000},
				{10380.983,18.492,10.000},
				{10382.588,16.046,10.000},
				{10383.948,13.603,10.000},
				{10385.064,11.162,10.000},
				{10385.949,8.847,10.000},
				{10386.629,6.794,10.000},
				{10387.130,5.012,10.000},
				{10387.480,3.502,10.000},
				{10387.706,2.262,10.000},
				{10387.835,1.293,10.000},
				{10387.895,0.595,10.000},
				{10387.912,0.168,10.000},
				{10387.913,0.011,10.000},
				{10387.913,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.014,0.271,10.000},
				{0.068,0.541,10.000},
				{0.189,1.218,10.000},
				{0.406,2.165,10.000},
				{0.744,3.383,10.000},
				{1.231,4.871,10.000},
				{1.894,6.630,10.000},
				{2.760,8.659,10.000},
				{3.856,10.959,10.000},
				{5.196,13.395,10.000},
				{6.779,15.830,10.000},
				{8.605,18.266,10.000},
				{10.675,20.701,10.000},
				{12.989,23.136,10.000},
				{15.546,25.572,10.000},
				{18.347,28.007,10.000},
				{21.391,30.443,10.000},
				{24.679,32.878,10.000},
				{28.210,35.314,10.000},
				{31.985,37.749,10.000},
				{36.004,40.184,10.000},
				{40.266,42.620,10.000},
				{44.771,45.055,10.000},
				{49.520,47.491,10.000},
				{54.513,49.926,10.000},
				{59.749,52.361,10.000},
				{65.229,54.797,10.000},
				{70.952,57.232,10.000},
				{76.919,59.668,10.000},
				{83.129,62.103,10.000},
				{89.583,64.539,10.000},
				{96.280,66.974,10.000},
				{103.221,69.409,10.000},
				{110.406,71.845,10.000},
				{117.834,74.280,10.000},
				{125.505,76.716,10.000},
				{133.420,79.151,10.000},
				{141.579,81.586,10.000},
				{149.981,84.022,10.000},
				{158.627,86.457,10.000},
				{167.516,88.893,10.000},
				{176.649,91.328,10.000},
				{186.025,93.764,10.000},
				{195.645,96.199,10.000},
				{205.509,98.634,10.000},
				{215.616,101.070,10.000},
				{225.966,103.505,10.000},
				{236.560,105.941,10.000},
				{247.398,108.376,10.000},
				{258.479,110.811,10.000},
				{269.804,113.247,10.000},
				{281.372,115.682,10.000},
				{293.184,118.118,10.000},
				{305.239,120.553,10.000},
				{317.538,122.989,10.000},
				{330.080,125.424,10.000},
				{342.866,127.859,10.000},
				{355.895,130.295,10.000},
				{369.169,132.730,10.000},
				{382.685,135.166,10.000},
				{396.445,137.601,10.000},
				{410.449,140.036,10.000},
				{424.696,142.472,10.000},
				{439.187,144.907,10.000},
				{453.921,147.343,10.000},
				{468.899,149.778,10.000},
				{484.120,152.214,10.000},
				{499.585,154.649,10.000},
				{515.293,157.084,10.000},
				{531.245,159.520,10.000},
				{547.441,161.955,10.000},
				{563.880,164.391,10.000},
				{580.563,166.826,10.000},
				{597.489,169.261,10.000},
				{614.658,171.697,10.000},
				{632.072,174.132,10.000},
				{649.728,176.568,10.000},
				{667.629,179.003,10.000},
				{685.773,181.439,10.000},
				{704.160,183.874,10.000},
				{722.791,186.309,10.000},
				{741.665,188.745,10.000},
				{760.783,191.180,10.000},
				{780.145,193.616,10.000},
				{799.750,196.051,10.000},
				{819.599,198.486,10.000},
				{839.691,200.922,10.000},
				{860.027,203.357,10.000},
				{880.606,205.793,10.000},
				{901.429,208.228,10.000},
				{922.495,210.664,10.000},
				{943.805,213.099,10.000},
				{965.358,215.534,10.000},
				{987.155,217.970,10.000},
				{1009.196,220.405,10.000},
				{1031.480,222.841,10.000},
				{1054.008,225.276,10.000},
				{1076.779,227.711,10.000},
				{1099.793,230.147,10.000},
				{1123.052,232.582,10.000},
				{1146.553,235.018,10.000},
				{1170.299,237.453,10.000},
				{1194.288,239.889,10.000},
				{1218.520,242.324,10.000},
				{1242.996,244.759,10.000},
				{1267.715,247.195,10.000},
				{1292.678,249.630,10.000},
				{1317.885,252.066,10.000},
				{1343.335,254.501,10.000},
				{1369.029,256.936,10.000},
				{1394.966,259.372,10.000},
				{1421.147,261.807,10.000},
				{1447.571,264.243,10.000},
				{1474.239,266.678,10.000},
				{1501.150,269.113,10.000},
				{1528.305,271.549,10.000},
				{1555.703,273.984,10.000},
				{1583.345,276.420,10.000},
				{1611.231,278.855,10.000},
				{1639.360,281.291,10.000},
				{1667.732,283.726,10.000},
				{1696.349,286.161,10.000},
				{1725.208,288.597,10.000},
				{1754.312,291.032,10.000},
				{1783.658,293.468,10.000},
				{1813.249,295.903,10.000},
				{1843.082,298.338,10.000},
				{1873.160,300.774,10.000},
				{1903.481,303.209,10.000},
				{1934.045,305.645,10.000},
				{1964.853,308.080,10.000},
				{1995.905,310.516,10.000},
				{2027.200,312.951,10.000},
				{2058.739,315.386,10.000},
				{2090.521,317.822,10.000},
				{2122.546,320.257,10.000},
				{2154.816,322.693,10.000},
				{2187.329,325.128,10.000},
				{2220.085,327.563,10.000},
				{2253.085,329.999,10.000},
				{2286.328,332.434,10.000},
				{2319.815,334.870,10.000},
				{2353.546,337.305,10.000},
				{2387.520,339.741,10.000},
				{2421.737,342.176,10.000},
				{2456.198,344.611,10.000},
				{2490.903,347.047,10.000},
				{2525.851,349.482,10.000},
				{2561.043,351.918,10.000},
				{2596.478,354.353,10.000},
				{2632.157,356.788,10.000},
				{2668.080,359.224,10.000},
				{2704.246,361.659,10.000},
				{2740.655,364.095,10.000},
				{2777.308,366.530,10.000},
				{2814.205,368.966,10.000},
				{2851.345,371.401,10.000},
				{2888.728,373.836,10.000},
				{2926.356,376.272,10.000},
				{2964.226,378.707,10.000},
				{3002.341,381.143,10.000},
				{3040.698,383.578,10.000},
				{3079.300,386.013,10.000},
				{3118.145,388.449,10.000},
				{3157.233,390.884,10.000},
				{3196.565,393.320,10.000},
				{3236.141,395.755,10.000},
				{3275.960,398.191,10.000},
				{3316.022,400.626,10.000},
				{3356.328,403.061,10.000},
				{3396.878,405.497,10.000},
				{3437.671,407.932,10.000},
				{3478.708,410.368,10.000},
				{3519.988,412.803,10.000},
				{3561.512,415.238,10.000},
				{3603.280,417.674,10.000},
				{3645.290,420.109,10.000},
				{3687.545,422.545,10.000},
				{3730.043,424.980,10.000},
				{3772.785,427.416,10.000},
				{3815.770,429.851,10.000},
				{3858.998,432.286,10.000},
				{3902.470,434.722,10.000},
				{3946.186,437.157,10.000},
				{3990.145,439.593,10.000},
				{4034.348,442.028,10.000},
				{4078.795,444.463,10.000},
				{4123.484,446.899,10.000},
				{4168.418,449.334,10.000},
				{4213.595,451.770,10.000},
				{4259.015,454.205,10.000},
				{4304.679,456.641,10.000},
				{4350.587,459.076,10.000},
				{4396.738,461.511,10.000},
				{4443.133,463.947,10.000},
				{4489.771,466.382,10.000},
				{4536.653,468.818,10.000},
				{4583.778,471.253,10.000},
				{4631.147,473.688,10.000},
				{4678.759,476.124,10.000},
				{4726.602,478.424,10.000},
				{4774.647,480.454,10.000},
				{4822.868,482.212,10.000},
				{4871.238,483.701,10.000},
				{4919.730,484.918,10.000},
				{4968.317,485.866,10.000},
				{5016.971,486.542,10.000},
				{5065.666,486.948,10.000},
				{5114.362,486.959,10.000},
				{5163.019,486.574,10.000},
				{5211.611,485.919,10.000},
				{5260.111,484.994,10.000},
				{5308.490,483.798,10.000},
				{5356.723,482.331,10.000},
				{5404.783,480.594,10.000},
				{5452.641,478.586,10.000},
				{5500.272,476.307,10.000},
				{5547.660,473.883,10.000},
				{5594.805,471.447,10.000},
				{5641.706,469.012,10.000},
				{5688.364,466.576,10.000},
				{5734.778,464.141,10.000},
				{5780.949,461.706,10.000},
				{5826.876,459.270,10.000},
				{5872.559,456.835,10.000},
				{5917.999,454.399,10.000},
				{5963.195,451.964,10.000},
				{6008.148,449.528,10.000},
				{6052.857,447.093,10.000},
				{6097.323,444.658,10.000},
				{6141.545,442.222,10.000},
				{6185.524,439.787,10.000},
				{6229.259,437.351,10.000},
				{6272.751,434.916,10.000},
				{6315.999,432.481,10.000},
				{6359.003,430.045,10.000},
				{6401.764,427.610,10.000},
				{6444.282,425.174,10.000},
				{6486.556,422.739,10.000},
				{6528.586,420.303,10.000},
				{6570.373,417.868,10.000},
				{6611.916,415.433,10.000},
				{6653.216,412.997,10.000},
				{6694.272,410.562,10.000},
				{6735.085,408.126,10.000},
				{6775.654,405.691,10.000},
				{6815.967,403.129,10.000},
				{6855.986,400.192,10.000},
				{6895.704,397.182,10.000},
				{6935.116,394.123,10.000},
				{6974.218,391.020,10.000},
				{7013.006,387.877,10.000},
				{7051.476,384.698,10.000},
				{7089.625,381.488,10.000},
				{7127.450,378.250,10.000},
				{7164.949,374.988,10.000},
				{7202.119,371.705,10.000},
				{7238.959,368.404,10.000},
				{7275.468,365.088,10.000},
				{7311.644,361.761,10.000},
				{7347.487,358.425,10.000},
				{7382.995,355.082,10.000},
				{7418.169,351.736,10.000},
				{7453.007,348.388,10.000},
				{7487.512,345.041,10.000},
				{7521.681,341.697,10.000},
				{7555.517,338.359,10.000},
				{7589.020,335.028,10.000},
				{7622.191,331.706,10.000},
				{7655.030,328.394,10.000},
				{7687.540,325.096,10.000},
				{7719.721,321.812,10.000},
				{7751.575,318.544,10.000},
				{7783.105,315.294,10.000},
				{7814.311,312.063,10.000},
				{7845.196,308.852,10.000},
				{7875.762,305.664,10.000},
				{7906.012,302.498,10.000},
				{7935.948,299.357,10.000},
				{7965.572,296.241,10.000},
				{7994.887,293.153,10.000},
				{8023.896,290.091,10.000},
				{8052.602,287.059,10.000},
				{8081.008,284.056,10.000},
				{8109.116,281.083,10.000},
				{8136.930,278.142,10.000},
				{8164.454,275.232,10.000},
				{8191.689,272.354,10.000},
				{8218.640,269.510,10.000},
				{8245.310,266.698,10.000},
				{8271.702,263.921,10.000},
				{8297.820,261.177,10.000},
				{8323.666,258.467,10.000},
				{8349.245,255.792,10.000},
				{8374.561,253.150,10.000},
				{8399.615,250.543,10.000},
				{8424.412,247.970,10.000},
				{8448.955,245.431,10.000},
				{8473.248,242.925,10.000},
				{8497.293,240.453,10.000},
				{8521.094,238.013,10.000},
				{8544.655,235.606,10.000},
				{8567.978,233.230,10.000},
				{8591.066,230.885,10.000},
				{8613.923,228.570,10.000},
				{8636.552,226.285,10.000},
				{8658.955,224.029,10.000},
				{8681.135,221.801,10.000},
				{8703.095,219.599,10.000},
				{8724.837,217.424,10.000},
				{8746.364,215.273,10.000},
				{8767.679,213.146,10.000},
				{8788.783,211.043,10.000},
				{8809.679,208.961,10.000},
				{8830.369,206.900,10.000},
				{8850.855,204.858,10.000},
				{8871.139,202.835,10.000},
				{8891.222,200.830,10.000},
				{8911.106,198.841,10.000},
				{8930.792,196.867,10.000},
				{8950.283,194.907,10.000},
				{8969.579,192.960,10.000},
				{8988.682,191.026,10.000},
				{9007.592,189.101,10.000},
				{9026.311,187.187,10.000},
				{9044.839,185.282,10.000},
				{9063.177,183.384,10.000},
				{9081.326,181.493,10.000},
				{9099.287,179.608,10.000},
				{9117.060,177.727,10.000},
				{9134.645,175.851,10.000},
				{9152.043,173.977,10.000},
				{9169.253,172.106,10.000},
				{9186.277,170.236,10.000},
				{9203.113,168.366,10.000},
				{9219.763,166.497,10.000},
				{9236.226,164.626,10.000},
				{9252.501,162.754,10.000},
				{9268.589,160.880,10.000},
				{9284.489,159.002,10.000},
				{9300.202,157.121,10.000},
				{9315.725,155.236,10.000},
				{9331.060,153.346,10.000},
				{9346.205,151.451,10.000},
				{9361.160,149.550,10.000},
				{9375.924,147.643,10.000},
				{9390.497,145.730,10.000},
				{9404.878,143.809,10.000},
				{9419.066,141.881,10.000},
				{9433.061,139.945,10.000},
				{9446.861,138.000,10.000},
				{9460.466,136.048,10.000},
				{9473.874,134.086,10.000},
				{9487.086,132.116,10.000},
				{9500.099,130.136,10.000},
				{9512.914,128.146,10.000},
				{9525.529,126.147,10.000},
				{9537.942,124.137,10.000},
				{9550.154,122.118,10.000},
				{9562.163,120.088,10.000},
				{9573.968,118.048,10.000},
				{9585.567,115.997,10.000},
				{9596.961,113.935,10.000},
				{9608.147,111.863,10.000},
				{9619.125,109.780,10.000},
				{9629.894,107.686,10.000},
				{9640.452,105.581,10.000},
				{9650.798,103.464,10.000},
				{9660.932,101.337,10.000},
				{9670.852,99.199,10.000},
				{9680.557,97.050,10.000},
				{9690.046,94.890,10.000},
				{9699.318,92.719,10.000},
				{9708.372,90.537,10.000},
				{9717.206,88.345,10.000},
				{9725.820,86.142,10.000},
				{9734.213,83.928,10.000},
				{9742.383,81.703,10.000},
				{9750.330,79.469,10.000},
				{9758.053,77.224,10.000},
				{9765.550,74.969,10.000},
				{9772.820,72.704,10.000},
				{9779.863,70.430,10.000},
				{9786.678,68.146,10.000},
				{9793.263,65.853,10.000},
				{9799.618,63.550,10.000},
				{9805.742,61.239,10.000},
				{9811.634,58.919,10.000},
				{9817.293,56.590,10.000},
				{9822.718,54.254,10.000},
				{9827.909,51.909,10.000},
				{9832.865,49.557,10.000},
				{9837.585,47.198,10.000},
				{9842.068,44.832,10.000},
				{9846.314,42.458,10.000},
				{9850.321,40.079,10.000},
				{9854.091,37.693,10.000},
				{9857.621,35.302,10.000},
				{9860.911,32.905,10.000},
				{9863.962,30.502,10.000},
				{9866.771,28.096,10.000},
				{9869.340,25.684,10.000},
				{9871.666,23.269,10.000},
				{9873.751,20.850,10.000},
				{9875.594,18.428,10.000},
				{9877.195,16.003,10.000},
				{9878.552,13.575,10.000},
				{9879.667,11.145,10.000},
				{9880.550,8.838,10.000},
				{9881.229,6.789,10.000},
				{9881.730,5.010,10.000},
				{9882.080,3.501,10.000},
				{9882.307,2.262,10.000},
				{9882.436,1.293,10.000},
				{9882.495,0.595,10.000},
				{9882.512,0.168,10.000},
				{9882.513,0.011,10.000},
				{9882.513,0.000,10.000}
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