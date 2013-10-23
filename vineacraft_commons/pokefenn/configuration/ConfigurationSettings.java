package pokefenn.configuration;

public class ConfigurationSettings {

    public static boolean VINE_ON_STARTUP;
    public static final String VINE_ON_STARTUP_CONFIGNAME = "vineOnStartup";
    public static final boolean VINE_ON_STARTUP_DEFAULT = true;
    
    public static int VINE_SAP_DENSITY;
    public static final String VINE_SAP_DENSITY_CONFIGNAME = "vineSapDensity";
    public static final int VINE_SAP_DENSITY_DEFAULT = 200;
    
    public static int VINE_SAP_VISCOSITY;
    public static final String VINE_SAP_VISCOSITY_CONFIGNAME = "vineSapViscosity";
    public static final int VINE_SAP_VISCOSITY_DEFAULT = 200;
	
	//public static double VINE_SAP_CREATION_MODIFIER;
	//public static final String VINE_SAP_CREATION_MODIFIER_CONFIGNAME = "vineSapCreationModifier";
	//public static final double VINE_SAP_CREATION_MODIFIER_DEFAULT = 1;
	
	public static int BASE_VINE_SAP_PER_VINE;
	public static final String BASE_VINE_SAP_PER_VINE_CONFIGNAME = "baseVineSapPerVine";
	public static final int BASE_VINE_SAP_PER_VINE_DEFAULT = 700;
	
	public static double VINE_SAP_MACHINE_USAGE_MODIFIER;
	public static final String VINE_SAP_MACHINE_USAGE_MODIFIER_CONFIGNAME = "vineSapMachineUsageModifier";
	public static final double VINE_SAP_MACHINE_USAGE_MODIFIER_DEFAULT = 1;
	
	public static double VINE_SAP_MANUAL_SQUEEZER_MODIFIER;
	public static final String VINE_SAP_MANUAL_SQUEEZER_MODIFIER_CONFIGNAME = "vineSapManualSqueezerModifier";
	public static final double VINE_SAP_MANUAL_SQUEEZER_MODIFIER_DEFAULT = 1.4;
	
	public static double VINE_SAP_ADVANCED_SQUEEZER_MODIFIER;
	public static final String VINE_SAP_ADVANCED_SQUEEZER_MODIFIER_CONFIGNAME = "vineSapAdvamcedSqueezerModifier";
	public static final double VINE_SAP_ADVANCED_SQUEEZER_MODIFIER_DEFAULT = 1.3;
	
	public static double VINE_SAP_AUTOMATIC_SQUEEZER_MODIFIER;
	public static final String VINE_SAP_AUTOMATIC_SQUEEZER_MODIFIER_CONFIGNAME = "vineSapAutomaticSqueezerModifier";
	public static final double VINE_SAP_AUTOMATIC_SQUEEZER_MODIFIER_DEFAULT = 1.1;
}
