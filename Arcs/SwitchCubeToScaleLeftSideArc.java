package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SwitchCubeToScaleLeftSideArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (17.88,20.79,10.00)
	// (23.38,22.29,0.00)
	
    public SwitchCubeToScaleLeftSideArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SwitchCubeToScaleLeftSideArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.549,-10.971,10.000,10.000},
				{-2.743,-32.913,10.000,10.000},
				{-7.680,-65.826,10.000,10.000},
				{-16.457,-109.710,10.000,10.000},
				{-30.170,-164.565,10.000,10.000},
				{-49.918,-230.391,10.000,10.000},
				{-76.797,-307.188,10.000,10.000},
				{-111.904,-394.956,10.000,10.000},
				{-156.337,-493.695,10.000,10.001},
				{-211.192,-603.405,10.000,10.001},
				{-277.566,-724.086,10.000,10.002},
				{-356.558,-855.738,10.000,10.003},
				{-449.262,-998.361,10.000,10.005},
				{-556.778,-1151.955,10.000,10.007},
				{-679.653,-1305.549,10.000,10.010},
				{-817.888,-1459.143,10.000,10.015},
				{-971.482,-1612.737,10.000,10.021},
				{-1140.435,-1766.331,10.000,10.029},
				{-1324.748,-1919.925,10.000,10.039},
				{-1524.420,-2073.519,10.000,10.051},
				{-1739.452,-2227.113,10.000,10.067},
				{-1969.843,-2380.707,10.000,10.085},
				{-2215.593,-2534.301,10.000,10.107},
				{-2476.703,-2687.895,10.000,10.133},
				{-2753.172,-2841.489,10.000,10.164},
				{-3045.001,-2995.083,10.000,10.199},
				{-3352.189,-3148.677,10.000,10.240},
				{-3674.737,-3302.271,10.000,10.287},
				{-4012.643,-3455.865,10.000,10.340},
				{-4365.910,-3609.459,10.000,10.399},
				{-4734.535,-3763.053,10.000,10.466},
				{-5118.520,-3916.647,10.000,10.541},
				{-5517.865,-4070.241,10.000,10.623},
				{-5932.568,-4223.835,10.000,10.715},
				{-6362.632,-4377.429,10.000,10.815},
				{-6808.054,-4531.023,10.000,10.925},
				{-7268.836,-4684.617,10.000,11.044},
				{-7744.978,-4838.211,10.000,11.174},
				{-8236.478,-4991.805,10.000,11.315},
				{-8743.339,-5145.399,10.000,11.466},
				{-9265.558,-5298.993,10.000,11.629},
				{-9803.137,-5452.587,10.000,11.803},
				{-10356.076,-5606.181,10.000,11.989},
				{-10924.373,-5759.775,10.000,12.187},
				{-11508.031,-5913.369,10.000,12.397},
				{-12107.047,-6066.963,10.000,12.619},
				{-12721.423,-6220.557,10.000,12.854},
				{-13351.159,-6374.151,10.000,13.101},
				{-13996.253,-6527.745,10.000,13.360},
				{-14656.708,-6681.339,10.000,13.631},
				{-15332.521,-6834.933,10.000,13.914},
				{-16023.694,-6988.527,10.000,14.209},
				{-16730.227,-7142.121,10.000,14.516},
				{-17452.119,-7295.715,10.000,14.833},
				{-18189.370,-7449.309,10.000,15.160},
				{-18941.980,-7602.903,10.000,15.498},
				{-19709.950,-7756.497,10.000,15.845},
				{-20493.280,-7910.091,10.000,16.201},
				{-21291.969,-8063.685,10.000,16.564},
				{-22106.017,-8217.279,10.000,16.935},
				{-22935.424,-8370.873,10.000,17.312},
				{-23780.191,-8524.467,10.000,17.693},
				{-24640.318,-8678.061,10.000,18.079},
				{-25515.804,-8831.655,10.000,18.468},
				{-26406.649,-8985.249,10.000,18.858},
				{-27312.853,-9138.843,10.000,19.248},
				{-28234.418,-9292.437,10.000,19.637},
				{-29171.341,-9446.031,10.000,20.024},
				{-30123.624,-9599.625,10.000,20.407},
				{-31091.266,-9753.219,10.000,20.784},
				{-32074.268,-9906.813,10.000,21.154},
				{-33072.629,-10060.407,10.000,21.515},
				{-34086.349,-10214.001,10.000,21.865},
				{-35115.429,-10367.595,10.000,22.204},
				{-36159.868,-10521.189,10.000,22.528},
				{-37219.667,-10674.783,10.000,22.837},
				{-38294.825,-10828.377,10.000,23.129},
				{-39385.342,-10981.971,10.000,23.401},
				{-40491.219,-11135.565,10.000,23.653},
				{-41611.907,-11278.188,10.000,23.881},
				{-42746.308,-11409.840,10.000,24.085},
				{-43893.326,-11530.521,10.000,24.262},
				{-45051.864,-11640.231,10.000,24.411},
				{-46220.824,-11738.970,10.000,24.530},
				{-47399.109,-11826.738,10.000,24.618},
				{-48585.623,-11903.535,10.000,24.673},
				{-49779.268,-11969.361,10.000,24.695},
				{-50978.947,-12024.216,10.000,24.682},
				{-52183.562,-12068.100,10.000,24.634},
				{-53392.018,-12101.013,10.000,24.550},
				{-54603.216,-12122.955,10.000,24.430},
				{-55815.909,-12130.904,10.000,24.273},
				{-57028.300,-12116.911,10.000,24.080},
				{-58238.743,-12091.947,10.000,23.852},
				{-59446.141,-12056.012,10.000,23.588},
				{-60649.397,-12009.106,10.000,23.290},
				{-61847.414,-11951.229,10.000,22.958},
				{-63039.094,-11882.381,10.000,22.594},
				{-64223.341,-11802.562,10.000,22.199},
				{-65399.058,-11711.772,10.000,21.775},
				{-66565.147,-11610.011,10.000,21.324},
				{-67720.512,-11497.279,10.000,20.847},
				{-68864.055,-11373.576,10.000,20.346},
				{-69994.679,-11238.902,10.000,19.825},
				{-71111.286,-11093.257,10.000,19.285},
				{-72212.933,-10939.663,10.000,18.730},
				{-73299.219,-10786.069,10.000,18.161},
				{-74370.146,-10632.475,10.000,17.580},
				{-75425.714,-10478.881,10.000,16.990},
				{-76465.923,-10325.287,10.000,16.393},
				{-77490.772,-10171.693,10.000,15.791},
				{-78500.261,-10018.099,10.000,15.186},
				{-79494.391,-9864.505,10.000,14.580},
				{-80473.162,-9710.911,10.000,13.975},
				{-81436.574,-9557.317,10.000,13.373},
				{-82384.626,-9403.723,10.000,12.775},
				{-83317.318,-9250.129,10.000,12.183},
				{-84234.652,-9096.535,10.000,11.598},
				{-85136.625,-8942.941,10.000,11.023},
				{-86023.240,-8789.347,10.000,10.458},
				{-86894.495,-8635.753,10.000,9.904},
				{-87750.390,-8482.159,10.000,9.363},
				{-88590.927,-8328.565,10.000,8.836},
				{-89416.103,-8174.971,10.000,8.323},
				{-90225.921,-8021.377,10.000,7.826},
				{-91020.379,-7867.783,10.000,7.344},
				{-91799.477,-7714.189,10.000,6.879},
				{-92563.217,-7560.595,10.000,6.431},
				{-93311.596,-7407.001,10.000,6.000},
				{-94044.617,-7253.407,10.000,5.586},
				{-94762.278,-7099.813,10.000,5.190},
				{-95464.579,-6946.219,10.000,4.811},
				{-96151.522,-6792.625,10.000,4.451},
				{-96823.105,-6639.031,10.000,4.107},
				{-97479.328,-6485.437,10.000,3.782},
				{-98120.192,-6331.843,10.000,3.473},
				{-98745.697,-6178.249,10.000,3.181},
				{-99355.842,-6024.655,10.000,2.907},
				{-99950.628,-5871.061,10.000,2.648},
				{-100530.054,-5717.467,10.000,2.406},
				{-101094.121,-5563.873,10.000,2.179},
				{-101642.829,-5410.279,10.000,1.967},
				{-102176.177,-5256.685,10.000,1.770},
				{-102694.166,-5103.091,10.000,1.587},
				{-103196.795,-4949.497,10.000,1.418},
				{-103684.065,-4795.903,10.000,1.262},
				{-104155.976,-4642.309,10.000,1.118},
				{-104612.527,-4488.715,10.000,0.987},
				{-105053.719,-4335.121,10.000,0.867},
				{-105479.551,-4181.527,10.000,0.757},
				{-105890.024,-4027.933,10.000,0.658},
				{-106285.138,-3874.339,10.000,0.569},
				{-106664.892,-3720.745,10.000,0.489},
				{-107029.287,-3567.151,10.000,0.418},
				{-107378.322,-3413.557,10.000,0.354},
				{-107711.998,-3259.963,10.000,0.298},
				{-108030.315,-3106.369,10.000,0.249},
				{-108333.272,-2952.775,10.000,0.206},
				{-108620.870,-2799.181,10.000,0.168},
				{-108893.108,-2645.587,10.000,0.136},
				{-109149.987,-2491.993,10.000,0.109},
				{-109391.507,-2338.399,10.000,0.086},
				{-109617.667,-2184.805,10.000,0.067},
				{-109828.468,-2031.211,10.000,0.052},
				{-110023.909,-1877.617,10.000,0.039},
				{-110203.991,-1724.023,10.000,0.029},
				{-110368.714,-1570.429,10.000,0.021},
				{-110518.077,-1416.835,10.000,0.015},
				{-110652.081,-1263.241,10.000,0.010},
				{-110770.725,-1109.647,10.000,0.007},
				{-110874.161,-959.075,10.000,0.004},
				{-110963.089,-819.474,10.000,0.003},
				{-111038.605,-690.844,10.000,0.002},
				{-111101.806,-573.185,10.000,0.001},
				{-111153.790,-466.497,10.000,0.001},
				{-111195.654,-370.780,10.000,0.000},
				{-111228.495,-286.034,10.000,0.000},
				{-111253.409,-212.259,10.000,0.000},
				{-111271.495,-149.455,10.000,0.000},
				{-111283.849,-97.622,10.000,0.000},
				{-111291.568,-56.760,10.000,0.000},
				{-111295.749,-26.869,10.000,0.000},
				{-111297.490,-7.949,10.000,0.000},
				{-111297.888,-0.000,10.000,0.000},
				{-111297.888,-0.000,10.000,0.000}		};

}