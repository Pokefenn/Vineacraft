package pokefenn.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import pokefenn.lib.ItemIds;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModItems {

    
    /* Mod item instances */
    
    public static Item vineParts;
    public static Item vineaShears;
    public static Item vineaWrench;
    public static Item vinium;
    public static Item infestationVine;
    public static Item vineaTankModule;
    public static Item vineaGrating;
    public static Item bucketVineSap;
    
    public static void init() {
        
       
        /* Initialize each mod item individually*/
        
        vineParts = new ItemVineParts(ItemIds.VINE_PARTS);
        vineaShears = new ItemVineaShears(ItemIds.VINEA_SHEARS);
        vineaWrench = new ItemVineaWrench(ItemIds.VINEA_WRENCH);
        vinium = new ItemVinium(ItemIds.VINIUM);
        infestationVine = new ItemInfestationVine(ItemIds.INFESTATION_VINE);
        vineaTankModule = new ItemVineaTankModule(ItemIds.VINEA_TANK_MODULE);
        vineaGrating = new ItemVineaGrating(ItemIds.VINEA_GRATING);
        bucketVineSap = new ItemBucketVineSap(ItemIds.BUCKET_VINE_SAP);
        
        
        //Shaped Recipes
        
        GameRegistry.addRecipe(new ItemStack(infestationVine), new Object[] { "vvv", "vsv", "vvv", Character.valueOf('v'), Block.vine, Character.valueOf('s'), Item.sugar });
        GameRegistry.addRecipe(new ItemStack(infestationVine), new Object[] { "vvv", "vbv", "vvv", Character.valueOf('v'), Block.vine, Character.valueOf('b'), Item.bone });
        GameRegistry.addRecipe(new ItemStack(vineaGrating), new Object[] { "vvv", "v v", "vvv", Character.valueOf('v'), Block.vine});
        GameRegistry.addRecipe(new ItemStack(vineaTankModule), new Object[] { "ggg", "gvg", "ggg", Character.valueOf('v'), Block.vine, Character.valueOf('g'), Block.glass  });
        GameRegistry.addRecipe(new ItemStack(vineaWrench), new Object[] { "v v", " v ", "v v", Character.valueOf('v'), ModItems.vinium });
        //GameRegistry.addRecipe(new ItemStack(vineaShears), new Object[] { " v", "v ", 'v', Character.valueOf('v'), ModItems.vinium });
        
        //Shapeless Recipes
        
        
        
        
    
    }
    //Texture stuff bro
    public static final String TEXTURE_LOCATION = "vineacraft";
    
    public static final String VINIUM_ICON = "vinium";
    public static final String VINEA_SHEARS_ICON = "vineaShears";
    public static final String INFESTATION_VINE_ICON = "infestationVine";
    public static final String VINEA_WRENCH_ICON = "vineaWrench";
    public static final String VINEA_GRATING_ICON = "vineaGrating";
    public static final String VINE_PARTS_ICON = "vineParts";
    public static final String VINEA_TANK_MODULE_ICON = "vineaTankModule";
    public static final String BUCKET_VINE_SAP_ICON = "bucketVineSap";
    
}
