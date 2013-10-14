package pokefenn.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
import pokefenn.fluid.ModFluids;
import pokefenn.item.thaumcraft.ItemVineHookFocus;
import pokefenn.lib.ItemIds;
import pokefenn.lib.Strings;


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
    public static Item vineaBallInfuser;
    public static Item vineaStick;
    public static Item vineapedia;
    public static Item vineaBoots;
    public static Item vineaLeggings;
    public static Item vineaChestplate;
    public static Item vineaHelmet;
    
    public static Item vineHookFocus;
    
    public static void init() {
        
       
        // Initialise each mod item
        
        vineParts = new ItemVineParts(ItemIds.VINE_PARTS);
        vineaShears = new ItemVineaShears(ItemIds.VINEA_SHEARS);
        //vineaWrench = new ItemVineaWrench(ItemIds.VINEA_WRENCH);
        vinium = new ItemVinium(ItemIds.VINIUM);
        infestationVine = new ItemInfestationVine(ItemIds.INFESTATION_VINE);
        vineaTankModule = new ItemVineaTankModule(ItemIds.VINEA_TANK_MODULE);
        vineaGrating = new ItemVineaGrating(ItemIds.VINEA_GRATING);
        bucketVineSap = new ItemBucketVineSap(ItemIds.BUCKET_VINE_SAP, 10);
        vineaBallInfuser = new ItemVineaBallInfuser(ItemIds.VINEA_BALL_INFUSER);
        vineaStick = new ItemVineaStick(ItemIds.VINEA_STICK);
        vineapedia = new ItemVineapedia(ItemIds.VINEAPEDIA);
        vineaBoots = new ItemVineaBoots(ItemIds.VINEA_BOOTS);
        vineaLeggings = new ItemVineaLeggings(ItemIds.VINEA_LEGGINGS);
        vineaChestplate = new ItemVineaChestpiece(ItemIds.VINEA_CHESTPLATE);
        vineaHelmet = new ItemVineaHelmet(ItemIds.VINEA_HELMET);
        
        
        registerContainers();
        
    
    }
    
    public static void initTC(){
    	
    	//vineHookFocus = new ItemVineHookFocus(ItemIds.VINE_HOOK_FOCUS);
    	
    	
    }
    
    static void registerContainers() {
    	
            FluidContainerRegistry.registerFluidContainer(new FluidContainerData(FluidRegistry.getFluidStack( ModFluids.vineSap.getName(), FluidContainerRegistry.BUCKET_VOLUME ),
                        new ItemStack(bucketVineSap),
                        new ItemStack(Item.bucketEmpty)
                    )
                );
        }
    	
    	
    }
    
   
    

    
    
    
    

