
plugins {
    id("com.gtnewhorizons.gtnhconvention")
}

dependencies {
    compileOnly("codechicken:CodeChickenLib:1.7.10-1.1.3.140:dev")
    compileOnly("com.github.GTNewHorizons:AppleCore:3.3.9")
    compileOnly("com.github.GTNewHorizons:BuildCraft:7.1.57:api")
    compileOnly("curse.maven:industrial-craft-242638:6833054")
    compileOnly("curse.maven:craftguide-75557:2459319")
    compileOnly("curse.maven:sextiarysector2-244083:2294538")
    compileOnly("maven.modrinth:notenoughitems-unofficial:sIHTkJWd")
    compileOnly("maven.modrinth:codechickencore-unofficial:eu8lHkhd")
    compileOnly("curse.maven:mceconomy2-242484:2294405")
    compileOnly("curse.maven:thaumcraft-223628:2227552")
    compileOnly("com.github.GTNewHorizons:Railcraft:9.17.24:dev")
    compileOnly("curse.maven:biomes-o-plenty-220318:2499612")
    compileOnly("curse.maven:forestry-59751:2333823")
    compileOnly(fileTree("libs") { include("*.jar") })
    implementation("com.googlecode.efficient-java-matrix-library:ejml:0.24")
    implementation(fileTree("libs") { include("*.jar") })
}
