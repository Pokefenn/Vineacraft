package pokefenn.configuration;

import static net.minecraftforge.common.Configuration.CATEGORY_GENERAL;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import pokefenn.vineacraft.Vineacraft;
import pokefenn.lib.BlockIds;
import pokefenn.lib.ItemIds;
import pokefenn.lib.Reference;
import pokefenn.lib.Strings;

import cpw.mods.fml.common.FMLLog;


public class ConfigurationHandler {

    public static Configuration configuration;
    
    
    public static void init(File configFile) {
        
        configuration = new Configuration(configFile);
        
        try {
            
            configuration.load();
            
            //Blocks
            BlockIds.AUTOMATIC_SQUEEZER = configuration.getBlock(Strings.AUTOMATIC_SQUEEZER_NAME, BlockIds.AUTOMATIC_SQUEEZER_DEFAULT).getInt(BlockIds.AUTOMATIC_SQUEEZER_DEFAULT);
            BlockIds.MANUAL_SQUEEZER = configuration.getBlock(Strings.MANUAL_SQUEEZER_NAME, BlockIds.MANUAL_SQUEEZER_DEFAULT).getInt(BlockIds.MANUAL_SQUEEZER_DEFAULT);
            BlockIds.VINEA_INFUSER = configuration.getBlock(Strings.VINEA_INFUSER_NAME, BlockIds.VINEA_INFUSER_DEFAULT).getInt(BlockIds.VINEA_INFUSER_DEFAULT);
            BlockIds.VINEA_FURNACE = configuration.getBlock(Strings.VINEA_FURNACE_NAME, BlockIds.VINEA_FURNACE_DEFAULT).getInt(BlockIds.VINEA_FURNACE_DEFAULT);
            BlockIds.VINEA_HARVESTER = configuration.getBlock(Strings.VINEA_HARVESTER_NAME, BlockIds.VINEA_HARVESTER_DEFAULT).getInt(BlockIds.VINEA_HARVESTER_DEFAULT);
            BlockIds.VINE_SAP_FLOWING = configuration.getBlock(Strings.VINE_SAP_FLOWING_NAME, BlockIds.VINE_SAP_FLOWING_DEFAULT).getInt(BlockIds.VINE_SAP_FLOWING_DEFAULT);
            BlockIds.VINE_SAP_STILL = configuration.getBlock(Strings.VINE_SAP_STILL_NAME, BlockIds.VINE_SAP_STILL_DEFAULT).getInt(BlockIds.VINE_SAP_STILL_DEFAULT);
            BlockIds.VINEA_HATCHER = configuration.getBlock(Strings.VINEA_HATCHER_NAME, BlockIds.VINEA_HATCHER_DEFAULT).getInt(BlockIds.VINEA_HATCHER_DEFAULT);
            BlockIds.LIQUID_COCOA_STILL = configuration.getBlock(Strings.LIQUID_COCOA_STILL_NAME, BlockIds.LIQUID_COCOA_STILL_DEFAULT).getInt(BlockIds.LIQUID_COCOA_STILL_DEFAULT);
            BlockIds.LIQUID_COCOA_FLOWING = configuration.getBlock(Strings.LIQUID_COCOA_FLOWING_NAME, BlockIds.LIQUID_COCOA_FLOWING_DEFAULT).getInt(BlockIds.LIQUID_COCOA_FLOWING_DEFAULT);
            BlockIds.ADVANCED_SQUEEZER = configuration.getBlock(Strings.ADVANCED_SQUEEZER_NAME, BlockIds.ADVANCED_SQEEZER_DEFAULT).getInt(BlockIds.ADVANCED_SQEEZER_DEFAULT);
            BlockIds.ADVANCED_MACHINE_BLOCK = configuration.getBlock(Strings.ADVANCED_MACHINE_BLOCK_NAME, BlockIds.ADVANCED_MACHINE_BLOCK_DEFAULT).getInt(BlockIds.ADVANCED_MACHINE_BLOCK_DEFAULT);
            BlockIds.BASIC_MACHINE_BLOCK = configuration.getBlock(Strings.BASIC_MACHINE_BLOCK_NAME, BlockIds.BASIC_MACHINE_BLOCK_DEFAULT).getInt(BlockIds.BASIC_MACHINE_BLOCK_DEFAULT);
            
            
            //Items
            ItemIds.VINE_PARTS = configuration.getItem(Strings.VINE_PARTS_NAME, ItemIds.VINE_PARTS_DEFAULT).getInt(ItemIds.VINE_PARTS_DEFAULT);
            ItemIds.VINEA_SHEARS = configuration.getItem(Strings.VINEA_SHEARS_NAME, ItemIds.VINEA_SHEARS_DEFAULT).getInt(ItemIds.VINEA_SHEARS_DEFAULT);
            ItemIds.VINEA_WRENCH = configuration.getItem(Strings.VINEA_WRENCH_NAME, ItemIds.VINEA_WRENCH_DEFAULT).getInt(ItemIds.VINEA_WRENCH_DEFAULT);
            ItemIds.VINIUM = configuration.getItem(Strings.VINIUM_NAME, ItemIds.VINIUM_DEFAULT).getInt(ItemIds.VINIUM_DEFAULT);
            ItemIds.INFESTATION_VINE = configuration.getItem(Strings.INFESTATION_VINE_NAME, ItemIds.INFESTATION_VINE_DEFAULT).getInt(ItemIds.INFESTATION_VINE_DEFAULT);
               
            
            
               
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
