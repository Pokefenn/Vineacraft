package pokefenn.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import pokefenn.lib.BlockIds;
import pokefenn.lib.ItemIds;
import pokefenn.lib.Reference;
import pokefenn.lib.Strings;
import cpw.mods.fml.common.FMLLog;


public class ConfigurationHandler {

    public static Configuration configuration;
    public static final String CATEGORY_GAMEPLAY = "gameplay";
    
    
    public static void init(File configFile) {
        
        configuration = new Configuration(configFile);
        
        try {
            
            configuration.load();
            
            ConfigurationSettings.VINE_ON_STARTUP = configuration.get(CATEGORY_GAMEPLAY, ConfigurationSettings.VINE_ON_STARTUP_CONFIGNAME, ConfigurationSettings.VINE_ON_STARTUP_DEFAULT).getBoolean(ConfigurationSettings.VINE_ON_STARTUP_DEFAULT);
            
            //Blocks
            BlockIds.AUTOMATIC_SQUEEZER = configuration.getBlock(Strings.AUTOMATIC_SQUEEZER_NAME, BlockIds.AUTOMATIC_SQUEEZER_DEFAULT).getInt(BlockIds.AUTOMATIC_SQUEEZER_DEFAULT);
            BlockIds.MANUAL_SQUEEZER = configuration.getBlock(Strings.MANUAL_SQUEEZER_NAME, BlockIds.MANUAL_SQUEEZER_DEFAULT).getInt(BlockIds.MANUAL_SQUEEZER_DEFAULT);
            BlockIds.VINEA_INFUSER = configuration.getBlock(Strings.VINEA_INFUSER_NAME, BlockIds.VINEA_INFUSER_DEFAULT).getInt(BlockIds.VINEA_INFUSER_DEFAULT);
            BlockIds.VINEA_FURNACE = configuration.getBlock(Strings.VINEA_FURNACE_NAME, BlockIds.VINEA_FURNACE_DEFAULT).getInt(BlockIds.VINEA_FURNACE_DEFAULT);
            BlockIds.VINEA_HARVESTER = configuration.getBlock(Strings.VINEA_HARVESTER_NAME, BlockIds.VINEA_HARVESTER_DEFAULT).getInt(BlockIds.VINEA_HARVESTER_DEFAULT);
            BlockIds.VINEA_HATCHER = configuration.getBlock(Strings.VINEA_HATCHER_NAME, BlockIds.VINEA_HATCHER_DEFAULT).getInt(BlockIds.VINEA_HATCHER_DEFAULT);
            //BlockIds.LIQUID_COCOA_STILL = configuration.getBlock(Strings.LIQUID_COCOA_STILL_NAME, BlockIds.LIQUID_COCOA_STILL_DEFAULT).getInt(BlockIds.LIQUID_COCOA_STILL_DEFAULT);
            //BlockIds.LIQUID_COCOA_FLOWING = configuration.getBlock(Strings.LIQUID_COCOA_FLOWING_NAME, BlockIds.LIQUID_COCOA_FLOWING_DEFAULT).getInt(BlockIds.LIQUID_COCOA_FLOWING_DEFAULT);
            BlockIds.ADVANCED_SQUEEZER = configuration.getBlock(Strings.ADVANCED_SQUEEZER_NAME, BlockIds.ADVANCED_SQEEZER_DEFAULT).getInt(BlockIds.ADVANCED_SQEEZER_DEFAULT);
            BlockIds.ADVANCED_MACHINE_BLOCK = configuration.getBlock(Strings.ADVANCED_MACHINE_BLOCK_NAME, BlockIds.ADVANCED_MACHINE_BLOCK_DEFAULT).getInt(BlockIds.ADVANCED_MACHINE_BLOCK_DEFAULT);
            BlockIds.BASIC_MACHINE_BLOCK = configuration.getBlock(Strings.BASIC_MACHINE_BLOCK_NAME, BlockIds.BASIC_MACHINE_BLOCK_DEFAULT).getInt(BlockIds.BASIC_MACHINE_BLOCK_DEFAULT);
            BlockIds.VINEA_BRICK = configuration.getBlock(Strings.VINEA_BRICK_NAME, BlockIds.VINEA_BRICK_DEFAULT).getInt(BlockIds.VINEA_BRICK_DEFAULT);
            BlockIds.VINEA_HOPPER = configuration.getBlock(Strings.VINEA_HOPPER_NAME, BlockIds.VINEA_HOPPER_DEFAULT).getInt(BlockIds.VINEA_HOPPER_DEFAULT);
            BlockIds.VINEA_FLUID_HOPPER = configuration.getBlock(Strings.VINEA_FLUID_HOPPER_NAME, BlockIds.VINEA_FLUID_HOPPER_DEFAULT).getInt(BlockIds.VINEA_FLUID_HOPPER_DEFAULT);
            BlockIds.BLOCK_VINE_SAP = configuration.getBlock(Strings.BLOCK_VINE_SAP_NAME, BlockIds.BLOCK_VINE_SAP_DEFAULT).getInt(BlockIds.BLOCK_VINE_SAP_DEFAULT);
            BlockIds.BLOCK_VINIUM = configuration.getBlock(Strings.BLOCK_VINIUM_NAME, BlockIds.BLOCK_VINIUM_DEFAULT).getInt(BlockIds.BLOCK_VINIUM_DEFAULT);
            BlockIds.BRIGHT_VINE = configuration.getBlock(Strings.BRIGHT_VINE_NAME, BlockIds.BRIGHT_VINE_DEFAULT).getInt(BlockIds.BRIGHT_VINE_DEFAULT);
            BlockIds.TEMP_VINE = configuration.getBlock(Strings.TEMP_VINE_NAME, BlockIds.TEMP_VINE_DEFAULT).getInt(BlockIds.TEMP_VINE_DEFAULT);
            
            
            //Items
            ItemIds.VINE_PARTS = configuration.getItem(Strings.VINE_PARTS_NAME, ItemIds.VINE_PARTS_DEFAULT).getInt(ItemIds.VINE_PARTS_DEFAULT);
            ItemIds.VINEA_SHEARS = configuration.getItem(Strings.VINEA_SHEARS_NAME, ItemIds.VINEA_SHEARS_DEFAULT).getInt(ItemIds.VINEA_SHEARS_DEFAULT);
            ItemIds.VINEA_WRENCH = configuration.getItem(Strings.VINEA_WRENCH_NAME, ItemIds.VINEA_WRENCH_DEFAULT).getInt(ItemIds.VINEA_WRENCH_DEFAULT);
            ItemIds.VINIUM = configuration.getItem(Strings.VINIUM_NAME, ItemIds.VINIUM_DEFAULT).getInt(ItemIds.VINIUM_DEFAULT);
            ItemIds.INFESTATION_VINE = configuration.getItem(Strings.INFESTATION_VINE_NAME, ItemIds.INFESTATION_VINE_DEFAULT).getInt(ItemIds.INFESTATION_VINE_DEFAULT);
            ItemIds.VINEA_TANK_MODULE = configuration.getItem(Strings.VINEA_TANK_MODULE_NAME, ItemIds.VINEA_TANK_MODULE_DEAFULT).getInt(ItemIds.VINEA_TANK_MODULE_DEAFULT);
            ItemIds.VINEA_GRATING = configuration.getItem(Strings.VINEA_GRATING_NAME, ItemIds.VINEA_GRATING_DEFAULT).getInt(ItemIds.VINEA_GRATING_DEFAULT);
            ItemIds.BUCKET_VINE_SAP = configuration.getItem(Strings.BUCKET_VINE_SAP_NAME, ItemIds.BUCKET_VINE_SAP_DEFAULT).getInt(ItemIds.BUCKET_VINE_SAP_DEFAULT);
            ItemIds.VINEA_BALL_INFUSER = configuration.getItem(Strings.VINEA_BALL_INFUSER_NAME, ItemIds.VINEA_BALL_INFUSER_DEFAULT).getInt(ItemIds.VINEA_BALL_INFUSER_DEFAULT);
            ItemIds.VINEA_STICK = configuration.getItem(Strings.VINEA_STICK_NAME, ItemIds.VINEA_STICK_DEFAULT).getInt(ItemIds.VINEA_STICK_DEFAULT);
            ItemIds.VINEAPEDIA = configuration.getItem(Strings.VINEAPEDIA_NAME, ItemIds.VINEAPEDIA_DEFAULT).getInt(ItemIds.VINEAPEDIA_DEFAULT);
            ItemIds.VINEA_BOOTS = configuration.getItem(Strings.VINEA_BOOTS_NAME, ItemIds.VINEA_BOOTS_DEFAULT).getInt(ItemIds.VINEA_BOOTS_DEFAULT);
            ItemIds.VINEA_LEGGINGS = configuration.getItem(Strings.VINEA_LEGGINGS_NAME, ItemIds.VINEA_LEGGINGS_DEFAULT).getInt(ItemIds.VINEA_LEGGINGS_DEFAULT);
            ItemIds.VINEA_CHESTPLATE = configuration.getItem(Strings.VINEA_CHESTPIECE_NAME, ItemIds.VINEA_CHESTPLATE_DEFAULT).getInt(ItemIds.VINEA_CHESTPLATE_DEFAULT);
            ItemIds.VINEA_HELMET = configuration.getItem(Strings.VINEA_HELMET_NAME, ItemIds.VINEA_HELMET_DEFAULT).getInt(ItemIds.VINEA_HELMET_DEFAULT);
            		
           
            //ItemIds.VINE_HOOK_FOCUS = configuration.getItem(Strings.VINE_HOOK_FOCUS, ItemIds.VINE_HOOK_FOCUS_DEFAULT).getInt(ItemIds.VINE_HOOK_FOCUS_DEFAULT);
            
           }
        
        catch (Exception e) {
            
            FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration");
            
        }
        
        finally {
            configuration.save(); 
        }
    }
        
        public static void set(String categoryName, String propertyName, String newValue) {

            configuration.load();
            if (configuration.getCategoryNames().contains(categoryName)) {
                if (configuration.getCategory(categoryName).containsKey(propertyName)) {
                    configuration.getCategory(categoryName).get(propertyName).set(newValue);
                }
            }
            configuration.save();
        
        
    }
    
    
    
  
    
}
