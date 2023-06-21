package barker.justin.trglass;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Main implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer("translucent-water").ifPresent(container -> {
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("translucent-water", "translucent-water"), container, Text.literal("Translucent Water"), ResourcePackActivationType.NORMAL);
        });
        BlockRenderLayerMap.INSTANCE.putBlock(block.minecraft.water, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(flowing_water, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(water, RenderLayer.getTranslucent());
    }
}
