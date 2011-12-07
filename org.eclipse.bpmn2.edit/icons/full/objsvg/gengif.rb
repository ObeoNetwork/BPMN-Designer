INKSPACE="/Applications/Inkscape.app/Contents/Resources/bin/inkscape"
Dir.glob("*.svg").each do |svg|
  base = svg.sub(/\.svg/, "")
  def export(svg, base, size)
    "#{INKSPACE} --export-height=#{size} --export-width=#{size} -f #{svg} -e ../obj#{size}/#{base}.png"
  end
  cmd = [export(svg, base, "16"),export(svg, base, "32"),export(svg, base, "64"),export(svg, base, "96")]
  system cmd.join(";")
end