package pokefenn.vineacraft;

import pokefenn.proxy.CommonProxy;
import pokefenn.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Vineacraft {

    @Instance(Reference.MOD_ID)
    public static Vineacraft instance;
    
    @SidedProxy(clientSide = "pokefenn.proxy.ClientProxy", serverSide = "pokefenn.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
       
        
    }
    
    @Init
    public void init(FMLInitializationEvent event){
        
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
    
    
    }
    

}