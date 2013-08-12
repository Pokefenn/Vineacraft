package pokefenn.item;

import net.minecraft.item.Item;
import pokefenn.lib.ItemIds;


public class ModItems {

    
    /* Mod item instances */
    
    public static Item vineParts;
    public static Item vineaShears;
    public static Item vineaWrench;
    public static Item vinium;
    public static Item infestationVine;
    
    public static void init() {
        
       
        /* Initialize each mod item indivudually*/
        
        vineParts = new ItemVineParts(ItemIds.VINE_PARTS);
        vineaShears = new ItemVineaShears(ItemIds.VINEA_SHEARS);
        vineaWrench = new ItemVineaWrench(ItemIds.VINEA_WRENCH);
        vinium = new ItemVinium(ItemIds.VINIUM);
        infestationVine = new ItemInfestationVine(ItemIds.INFESTATION_VINE);
        
        //GameRegistry.registerItem(vineParts, Strings.VINE_PARTS_NAME);
        
    }
    
    public static final String TEXTURE_LOCATION = "mods";
    
    public static final String VINIUM_ICON = "vinium";
    public static final String VINEA_SHEARS_ICON = "vineaShears";
    public static final String INFESTATION_VINE_ICON = "infestationVine";
    public static final String VINEA_WRENCH_ICON = "vineaWrench";
    
}
