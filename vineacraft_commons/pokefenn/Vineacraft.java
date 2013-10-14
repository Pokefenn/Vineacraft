package pokefenn;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import pokefenn.block.ModBlocks;
import pokefenn.configuration.ConfigurationHandler;
import pokefenn.creativetab.CreativeTabVineacraft;
import pokefenn.fluid.ModFluids;
import pokefenn.gui.GuiHandler;
import pokefenn.handlers.LocalizationHandler;
import pokefenn.item.ModItems;
import pokefenn.lib.Reference;
import pokefenn.network.PacketHandler;
import pokefenn.proxy.CommonProxy;
import pokefenn.recipe.VineacraftRecipes;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;



@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class Vineacraft {

	//Instance of vineacraft
	
    @Instance(Reference.MOD_ID)
    public static Vineacraft instance;
    
    //Client/Common proxy
    
    @SidedProxy(clientSide = "pokefenn.proxy.ClientProxy", serverSide = "pokefenn.proxy.CommonProxy")
    public static CommonProxy proxy;

    //Creative tab stuff
    
    public static CreativeTabs tabsVineac = new CreativeTabVineacraft(
            CreativeTabs.getNextID(), Reference.MOD_NAME);

        
    

    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	//new VineSpawn();
    	
    	
     // Load localisation stuff bro
    	
    	LocalizationHandler.loadLanguages();
    	
    	
    	
     // Initialize the configuration
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory()
                .getAbsolutePath()
                + File.separator
                + Reference.CHANNEL_NAME
                + File.separator + Reference.MOD_NAME + ".cfg"));

        
        proxy.registerRenderers();
        
        //TickRegistry.registerTickHandler(new VersionCheckTickHandler(), Side.CLIENT)
        
        //proxy.registerRenderTickHandler();
        
        
        
        
      //Init Fluids
    	ModFluids.init();
    	
    	
      // Initialise mod blocks
        ModBlocks.init();


     // Initialise mod items
        ModItems.init();
        
        
        if (Loader.isModLoaded("TConstruct")){
        	
        	
        }
        
        //Test of some code :P
        if (Loader.isModLoaded("Thaumcraft")){
        	
        	
        	
        }
        
        //Initialise crafting recipes
        VineacraftRecipes.init();
        
        


        
        
        System.out.println("Ooooh, what does this button do?");
        System.out.println("Please Dee-Dee don't click the button!");        
        System.out.println("BOOM!!!");
        
        
        
		}
    
    @EventHandler
    public void init(FMLInitializationEvent event){
        
    	
        //GuiHandlerStuff
        new GuiHandler();
        

        CommonProxy.registerTileEntities();
    }
    
    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent event) {
    
    
     // Initialize the Addon Handler
        //AddonHandler.init();
                
        //Addon for Tinkers Construct
        //if (Loader.isModLoaded("TConstruct")){
            
        //VineaTinkerAddon.init();
        //System.out.println("[Vineacraft] Tinkers Construct Loaded");
    //}
        
        //Addon for forestry.
        //if (Loader.isModLoaded("Forestry")){
        	
        	//VineaForestryAddon.init();
        //System.out.println("Forestry stuff working");
    //}

}
}