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


@SuppressWarnings("unused")
public class ConfigurationHandler {

    public static Configuration configuration;
    
    
    public static void init(File configFile) {
        
        try {
            
            configuration.load();
 
            BlockIds.AUTOMATIC_SQUEEZER = configuration.getBlock(Strings.VINEA_INFUSER_NAME, BlockIds.VINEA_INFUSER_DEFAULT).getInt(BlockIds.VINEA_INFUSER_DEFAULT);
            BlockIds.MANUAL_SQUEEZER = configuration.getBlock(Strings.MANUAL_SQUEEZER_NAME, BlockIds.MANUAL_SQUEEZER_DEFAULT).getInt(BlockIds.MANUAL_SQUEEZER_DEFAULT);
            BlockIds.VINEA_INFUSER = configuration.getBlock(Strings.VINEA_INFUSER_NAME, BlockIds.VINEA_INFUSER_DEFAULT).getInt(BlockIds.VINEA_INFUSER_DEFAULT);
            BlockIds.VINEA_FURNACE = configuration.getBlock(Strings.VINEA_FURNACE_NAME, BlockIds.VINEA_FURNACE_DEFAULT).getInt(BlockIds.VINEA_INFUSER_DEFAULT);
            BlockIds.VINEA_HARVESTER = configuration.getBlock(Strings.VINEA_HARVESTER_NAME, BlockIds.VINEA_HARVESTER_DEFAULT).getInt(BlockIds.VINEA_HARVESTER_DEFAULT);
            BlockIds.VINE_SAP_FLOWING = configuration.getBlock(Strings.VINE_SAP_FLOWING_NAME, BlockIds.VINE_SAP_FLOWING_DEFAULT).getInt(BlockIds.VINE_SAP_FLOWING_DEFAULT);
            BlockIds.VINE_SAP_STILL = configuration.getBlock(Strings.VINE_SAP_STILL_NAME, BlockIds.VINE_SAP_STILL_DEFAULT).getInt(BlockIds.VINE_SAP_STILL_DEFAULT);
            BlockIds.VINEA_HATCHER = configuration.getBlock(Strings.VINEA_HATCHER_NAME, BlockIds.VINEA_HATCHER_DEFAULT).getInt(BlockIds.VINEA_HATCHER_DEFAULT);
 
            ItemIds.VINE_PARTS = configuration.getItem(Strings.VINE_PARTS_NAME, ItemIds.VINE_PARTS_DEFAULT).getInt(ItemIds.VINE_PARTS_DEFAULT);
            ItemIds.ADVANCED_VINEA_MACHINE_BLOCK = configuration.getItem(Strings.ADVANCED_VINEA_MACHINE_BLOCK_NAME, ItemIds.ADVANCED_VINEA_MACHINE_BLOCK_DEFAULT).getInt(ItemIds.ADVANCED_VINEA_MACHINE_BLOCK_DEFAULT);
            ItemIds.VINEA_SHEARS = configuration.getItem(Strings.VINEA_SHEARS_NAME, ItemIds.VINEA_SHEARS_DEFAULT).getInt(ItemIds.VINEA_SHEARS_DEFAULT);
           
            
               
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
