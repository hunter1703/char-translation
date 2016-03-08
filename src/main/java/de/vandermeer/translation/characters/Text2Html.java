/* Copyright 2015 Sven van der Meer <vdmeer.sven@mykolab.com\>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.vandermeer.translation.characters;

import org.apache.commons.lang3.StringUtils;

/**
 * Translator for plain text characters to HTML (code or entity).
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt; - auto-generated by SKB Datatool from SKB CharacterMap data
 * @version    v0.0.1 build 151209 (09-Dec-15)
 */
public class Text2Html implements CharacterTranslator {

	/** Array of source strings. */
	protected String[] sourceArray = new String[]{
		"#", "#", "#", "#", "#", "#", "%", "&", "<", ">", "?", "\"", "\\", "¡", "¢", "£", "¤", "¥", "¦", "§", "¨", "©", "ª", "«", "¬", "­", "®", "¯", "°", "±", "²", "³", "´", "µ", "¶", "·", "¸", "¹", "º", "»", "¼", "½", "¾", "¿", "À", "Á", "Â", "Ã", "Ä", "Å", "Æ", "Ç", "È", "É", "Ê", "Ë", "Ì", "Í", "Î", "Ï", "Ð", "Ñ", "Ò", "Ó", "Ô", "Õ", "Ö", "×", "Ø", "Ù", "Ú", "Û", "Ü", "Ý", "Þ", "ß", "à", "á", "â", "ã", "ä", "å", "æ", "ç", "è", "é", "ê", "ë", "ì", "í", "î", "ï", "ð", "ñ", "ò", "ó", "ô", "õ", "ö", "÷", "ø", "ù", "ú", "û", "ü", "ý", "þ", "ÿ", "Ā", "ā", "Ă", "ă", "Ą", "ą", "Ć", "ć", "Ĉ", "ĉ", "Ċ", "ċ", "Č", "č", "Ď", "ď", "Đ", "đ", "Ē", "ē", "Ĕ", "ĕ", "Ė", "ė", "Ę", "ę", "Ě", "ě", "Ĝ", "ĝ", "Ğ", "ğ", "Ġ", "ġ", "Ģ", "ģ", "Ĥ", "ĥ", "Ħ", "ħ", "Ĩ", "ĩ", "Ī", "ī", "Ĭ", "ĭ", "Į", "į", "İ", "ı", "Ĳ", "ĳ", "Ĵ", "ĵ", "Ķ", "ķ", "ĸ", "Ĺ", "ĺ", "Ļ", "ļ", "Ľ", "ľ", "Ŀ", "ŀ", "Ł", "ł", "Ń", "ń", "Ņ", "ņ", "Ň", "ň", "ŉ", "Ŋ", "ŋ", "Ō", "ō", "Ŏ", "ŏ", "Ő", "ő", "Œ", "œ", "Ŕ", "ŕ", "Ŗ", "ŗ", "Ř", "ř", "Ś", "ś", "Ŝ", "ŝ", "Ş", "ş", "Š", "š", "Ţ", "ţ", "Ť", "ť", "Ŧ", "ŧ", "Ũ", "ũ", "Ū", "ū", "Ŭ", "ŭ", "Ů", "ů", "Ű", "ű", "Ų", "ų", "Ŵ", "ŵ", "Ŷ", "ŷ", "Ÿ", "Ź", "ź", "Ż", "ż", "Ž", "ž", "ſ", "ƀ", "Ɓ", "Ƃ", "ƃ", "Ƅ", "ƅ", "Ɔ", "Ƈ", "ƈ", "Ɖ", "Ɗ", "Ƌ", "ƌ", "ƍ", "Ǝ", "Ə", "Ɛ", "Ƒ", "ƒ", "Ɠ", "Ɣ", "ƕ", "Ɩ", "Ɨ", "Ƙ", "ƙ", "ƚ", "ƛ", "Ɯ", "Ɲ", "ƞ", "Ɵ", "Ơ", "ơ", "Ƣ", "ƣ", "Ƥ", "ƥ", "Ʀ", "Ƨ", "ƨ", "Ʃ", "ƪ", "ƫ", "Ƭ", "ƭ", "Ʈ", "Ư", "ư", "Ʊ", "Ʋ", "Ƴ", "ƴ", "Ƶ", "ƶ", "Ʒ", "Ƹ", "ƹ", "ƺ", "ƻ", "Ƽ", "ƽ", "ƾ", "ƿ", "ǀ", "ǁ", "ǂ", "ǃ", "Ǆ", "ǅ", "ǆ", "Ǉ", "ǈ", "ǉ", "Ǌ", "ǋ", "ǌ", "Ǎ", "ǎ", "Ǐ", "ǐ", "Ǒ", "ǒ", "Ǔ", "ǔ", "Ǖ", "ǖ", "Ǘ", "ǘ", "Ǚ", "ǚ", "Ǜ", "ǜ", "ǝ", "Ǟ", "ǟ", "Ǡ", "ǡ", "Ǣ", "ǣ", "Ǥ", "ǥ", "Ǧ", "ǧ", "Ǩ", "ǩ", "Ǫ", "ǫ", "Ǭ", "ǭ", "Ǯ", "ǯ", "ǰ", "Ǳ", "ǲ", "ǳ", "Ǵ", "ǵ", "Ƕ", "Ƿ", "Ǹ", "ǹ", "Ǻ", "ǻ", "Ǽ", "ǽ", "Ǿ", "ǿ", "Ȁ", "ȁ", "Ȃ", "ȃ", "Ȅ", "ȅ", "Ȇ", "ȇ", "Ȉ", "ȉ", "Ȋ", "ȋ", "Ȍ", "ȍ", "Ȏ", "ȏ", "Ȑ", "ȑ", "Ȓ", "ȓ", "Ȕ", "ȕ", "Ȗ", "ȗ", "Ș", "ș", "Ț", "ț", "Ȝ", "ȝ", "Ȟ", "ȟ", "Ƞ", "ȡ", "Ȣ", "ȣ", "Ȥ", "ȥ", "Ȧ", "ȧ", "Ȩ", "ȩ", "Ȫ", "ȫ", "Ȭ", "ȭ", "Ȯ", "ȯ", "Ȱ", "ȱ", "Ȳ", "ȳ", "ȴ", "ȵ", "ȶ", "ȷ", "ȸ", "ȹ", "Ⱥ", "Ȼ", "ȼ", "Ƚ", "Ⱦ", "ȿ", "ɀ", "Ɂ", "ɂ", "Ƀ", "Ʉ", "Ʌ", "Ɇ", "ɇ", "Ɉ", "ɉ", "Ɋ", "ɋ", "Ɍ", "ɍ", "Ɏ", "ɏ", "ʰ", "ʱ", "ʲ", "ʳ", "ʴ", "ʵ", "ʶ", "ʷ", "ʸ", "ʹ", "ʺ", "ʻ", "ʼ", "ʽ", "ʾ", "ʿ", "ˀ", "ˁ", "˂", "˃", "˄", "˅", "ˆ", "ˇ", "ˈ", "ˉ", "ˊ", "ˋ", "ˌ", "ˍ", "ˎ", "ˏ", "ː", "ˑ", "˒", "˓", "˔", "˕", "˖", "˗", "˘", "˙", "˚", "˛", "˜", "˝", "˞", "˟", "ˠ", "ˡ", "ˢ", "ˣ", "ˤ", "˥", "˦", "˧", "˨", "˩", "˪", "˫", "ˬ", "˭", "ˮ", "˯", "˰", "˱", "˲", "˳", "˴", "˵", "˶", "˷", "˸", "˹", "˺", "˻", "˼", "˽", "˾", "˿", "̂", "̄", "̅", "̆", "̇", "̈", "̊", "̋", "̌", "̍", "̎", "̏", "̐", "̑", "̒", "̓", "̔", "̕", "̖", "̗", "̘", "̙", "̚", "̛", "̜", "̝", "̞", "̟", "̠", "̡", "̢", "̤", "̥", "̦", "̧", "̨", "̩", "̪", "̫", "̬", "̭", "̮", "̯", "̰", "̱", "̲", "̳", "̴", "̵", "̶", "̷", "̸", "̹", "̺", "̻", "̼", "̽", "̾", "̿", "̀", "́", "͂", "̓", "̈́", "ͅ", "͆", "͇", "͈", "͉", "͊", "͋", "͌", "͍", "͎", "͏", "͐", "͑", "͒", "͓", "͔", "͕", "͖", "͗", "͘", "͙", "͚", "͛", "͜", "͝", "͞", "͟", "͠", "͡", "͢", "ͣ", "ͤ", "ͥ", "ͦ", "ͧ", "ͨ", "ͩ", "ͪ", "ͫ", "ͬ", "ͭ", "ͮ", "ͯ", "Ͱ", "ͱ", "Ͳ", "ͳ", "ʹ", "͵", "Ͷ", "ͷ", "ͺ", "ͻ", "ͼ", "ͽ", ";", "Ϳ", "΄", "΅", "Ά", "·", "Έ", "Ή", "Ί", "Ό", "Ύ", "Ώ", "ΐ", "Α", "Β", "Γ", "Δ", "Ε", "Ζ", "Η", "Θ", "Ι", "Κ", "Λ", "Μ", "Ν", "Ξ", "Ο", "Π", "Ρ", "Σ", "Τ", "Υ", "Φ", "Χ", "Ψ", "Ω", "Ϊ", "Ϋ", "ά", "έ", "ή", "ί", "ΰ", "α", "β", "γ", "δ", "ε", "ζ", "η", "θ", "ι", "κ", "λ", "μ", "ν", "ξ", "ο", "π", "ρ", "ς", "σ", "τ", "υ", "φ", "χ", "ψ", "ω", "ϊ", "ϋ", "ό", "ύ", "ώ", "Ϗ", "ϐ", "ϑ", "ϒ", "ϓ", "ϔ", "ϕ", "ϖ", "ϗ", "Ϙ", "ϙ", "Ϛ", "ϛ", "Ϝ", "ϝ", "Ϟ", "ϟ", "Ϡ", "ϡ", "Ϣ", "ϣ", "Ϥ", "ϥ", "Ϧ", "ϧ", "Ϩ", "ϩ", "Ϫ", "ϫ", "Ϭ", "ϭ", "Ϯ", "ϯ", "ϰ", "ϱ", "ϲ", "ϳ", "ϴ", "ϵ", "϶", "Ϸ", "ϸ", "Ϲ", "Ϻ", "ϻ", "ϼ", "Ͻ", "Ͼ", "Ͽ", "Ḁ", "ḁ", "Ḃ", "ḃ", "Ḅ", "ḅ", "Ḇ", "ḇ", "Ḉ", "ḉ", "Ḋ", "ḋ", "Ḍ", "ḍ", "Ḏ", "ḏ", "Ḑ", "ḑ", "Ḓ", "ḓ", "Ḕ", "ḕ", "Ḗ", "ḗ", "Ḙ", "ḙ", "Ḛ", "ḛ", "Ḝ", "ḝ", "Ḟ", "ḟ", "Ḡ", "ḡ", "Ḣ", "ḣ", "Ḥ", "ḥ", "Ḧ", "ḧ", "Ḩ", "ḩ", "Ḫ", "ḫ", "Ḭ", "ḭ", "Ḯ", "ḯ", "Ḱ", "ḱ", "Ḳ", "ḳ", "Ḵ", "ḵ", "Ḷ", "ḷ", "Ḹ", "ḹ", "Ḻ", "ḻ", "Ḽ", "ḽ", "Ḿ", "ḿ", "Ṁ", "ṁ", "Ṃ", "ṃ", "Ṅ", "ṅ", "Ṇ", "ṇ", "Ṉ", "ṉ", "Ṋ", "ṋ", "Ṍ", "ṍ", "Ṏ", "ṏ", "Ṑ", "ṑ", "Ṓ", "ṓ", "Ṕ", "ṕ", "Ṗ", "ṗ", "Ṙ", "ṙ", "Ṛ", "ṛ", "Ṝ", "ṝ", "Ṟ", "ṟ", "Ṡ", "ṡ", "Ṣ", "ṣ", "Ṥ", "ṥ", "Ṧ", "ṧ", "Ṩ", "ṩ", "Ṫ", "ṫ", "Ṭ", "ṭ", "Ṯ", "ṯ", "Ṱ", "ṱ", "Ṳ", "ṳ", "Ṵ", "ṵ", "Ṷ", "ṷ", "Ṹ", "ṹ", "Ṻ", "ṻ", "Ṽ", "ṽ", "Ṿ", "ṿ", "Ẁ", "ẁ", "Ẃ", "ẃ", "Ẅ", "ẅ", "Ẇ", "ẇ", "Ẉ", "ẉ", "Ẋ", "ẋ", "Ẍ", "ẍ", "Ẏ", "ẏ", "Ẑ", "ẑ", "Ẓ", "ẓ", "Ẕ", "ẕ", "ẖ", "ẗ", "ẘ", "ẙ", "ẚ", "ẛ", "ẜ", "ẝ", "ẞ", "ẟ", "Ạ", "ạ", "Ả", "ả", "Ấ", "ấ", "Ầ", "ầ", "Ẩ", "ẩ", "Ẫ", "ẫ", "Ậ", "ậ", "Ắ", "ắ", "Ằ", "ằ", "Ẳ", "ẳ", "Ẵ", "ẵ", "Ặ", "ặ", "Ẹ", "ẹ", "Ẻ", "ẻ", "Ẽ", "ẽ", "Ế", "ế", "Ề", "ề", "Ể", "ể", "Ễ", "ễ", "Ệ", "ệ", "Ỉ", "ỉ", "Ị", "ị", "Ọ", "ọ", "Ỏ", "ỏ", "Ố", "ố", "Ồ", "ồ", "Ổ", "ổ", "Ỗ", "ỗ", "Ộ", "ộ", "Ớ", "ớ", "Ờ", "ờ", "Ở", "ở", "Ỡ", "ỡ", "Ợ", "ợ", "Ụ", "ụ", "Ủ", "ủ", "Ứ", "ứ", "Ừ", "ừ", "Ử", "ử", "Ữ", "ữ", "Ự", "ự", "Ỳ", "ỳ", "Ỵ", "ỵ", "Ỷ", "ỷ", "Ỹ", "ỹ", "Ỻ", "ỻ", "Ỽ", "ỽ", "Ỿ", "ỿ", "‐", "‑", "‒", "–", "—", "―", "‖", "‗", "‘", "’", "‚", "‛", "“", "”", "„", "‟", "†", "‡", "•", "‣", "․", "‥", "…", "‧", " ", "‰", "‱", "′", "″", "‴", "‵", "‶", "‷", "‸", "‹", "›", "※", "‼", "‽", "‾", "‿", "⁀", "⁁", "⁂", "⁃", "⁄", "⁅", "⁆", "⁇", "⁈", "⁉", "⁊", "⁋", "⁌", "⁍", "⁎", "⁏", "⁐", "⁑", "⁒", "⁓", "⁔", "⁕", "⁖", "⁗", "⁘", "⁙", "⁚", "⁛", "⁜", "⁝", "⁞", " ", "₠", "₡", "₢", "₣", "₤", "₥", "₦", "₧", "₨", "₩", "₪", "₫", "€", "₭", "₮", "₯", "₰", "₱", "₲", "₳", "₴", "₵", "₶", "₷", "₸", "₹", "₺", "₻", "₼", "₽", "℀", "℁", "ℂ", "℃", "℄", "℅", "℆", "ℇ", "℈", "℉", "ℊ", "ℋ", "ℌ", "ℍ", "ℎ", "ℏ", "ℐ", "ℑ", "ℒ", "ℓ", "℔", "ℕ", "№", "℗", "℘", "ℙ", "ℚ", "ℛ", "ℜ", "ℝ", "℞", "℟", "℠", "℡", "™", "℣", "ℤ", "℥", "Ω", "℧", "ℨ", "℩", "K", "Å", "ℬ", "ℭ", "℮", "ℯ", "ℰ", "ℱ", "Ⅎ", "ℳ", "ℴ", "ℵ", "ℶ", "ℷ", "ℸ", "ℹ", "℺", "℻", "ℼ", "ℽ", "ℾ", "ℿ", "⅀", "⅁", "⅂", "⅃", "⅄", "ⅅ", "ⅆ", "ⅇ", "ⅈ", "ⅉ", "⅊", "⅋", "⅌", "⅍", "ⅎ", "⅏", "←", "↑", "→", "↓", "↔", "↕", "↖", "↗", "↘", "↙", "↚", "↛", "↜", "↝", "↞", "↟", "↠", "↡", "↢", "↣", "↤", "↥", "↦", "↧", "↨", "↩", "↪", "↫", "↬", "↭", "↮", "↯", "↰", "↱", "↲", "↳", "↴", "↵", "↶", "↷", "↸", "↹", "↺", "↻", "↼", "↽", "↾", "↿", "⇀", "⇁", "⇂", "⇃", "⇄", "⇅", "⇆", "⇇", "⇈", "⇉", "⇊", "⇋", "⇌", "⇍", "⇎", "⇏", "⇐", "⇑", "⇒", "⇓", "⇔", "⇕", "⇖", "⇗", "⇘", "⇙", "⇚", "⇛", "⇜", "⇝", "⇞", "⇟", "⇠", "⇡", "⇢", "⇣", "⇤", "⇥", "⇦", "⇧", "⇨", "⇩", "⇪", "⇫", "⇬", "⇭", "⇮", "⇯", "⇰", "⇱", "⇲", "⇳", "⇴", "⇵", "⇶", "⇷", "⇸", "⇹", "⇺", "⇻", "⇼", "⇽", "⇾", "⇿", "∀", "∁", "∂", "∃", "∄", "∅", "∆", "∇", "∈", "∉", "∊", "∋", "∌", "∍", "∎", "∏", "∐", "∑", "−", "∓", "∔", "∕", "∖", "∗", "∘", "∙", "√", "∛", "∜", "∝", "∞", "∟", "∠", "∡", "∢", "∣", "∤", "∥", "∦", "∧", "∨", "∩", "∪", "∫", "∬", "∭", "∮", "∯", "∰", "∱", "∲", "∳", "∴", "∵", "∶", "∷", "∸", "∹", "∺", "∻", "∼", "∽", "∾", "∿", "≀", "≁", "≂", "≃", "≄", "≅", "≆", "≇", "≈", "≉", "≊", "≋", "≌", "≍", "≎", "≏", "≐", "≑", "≒", "≓", "≔", "≕", "≖", "≗", "≘", "≙", "≚", "≛", "≜", "≝", "≞", "≟", "≠", "≡", "≢", "≣", "≤", "≥", "≦", "≧", "≨", "≩", "≪", "≫", "≬", "≭", "≮", "≯", "≰", "≱", "≲", "≳", "≴", "≵", "≶", "≷", "≸", "≹", "≺", "≻", "≼", "≽", "≾", "≿", "⊀", "⊁", "⊂", "⊃", "⊄", "⊅", "⊆", "⊇", "⊈", "⊉", "⊊", "⊋", "⊌", "⊍", "⊎", "⊏", "⊐", "⊑", "⊒", "⊓", "⊔", "⊕", "⊖", "⊗", "⊘", "⊙", "⊚", "⊛", "⊜", "⊝", "⊞", "⊟", "⊠", "⊡", "⊢", "⊣", "⊤", "⊥", "⊦", "⊧", "⊨", "⊩", "⊪", "⊫", "⊬", "⊭", "⊮", "⊯", "⊰", "⊱", "⊲", "⊳", "⊴", "⊵", "⊶", "⊷", "⊸", "⊹", "⊺", "⊻", "⊼", "⊽", "⊾", "⊿", "⋀", "⋁", "⋂", "⋃", "⋄", "⋅", "⋆", "⋇", "⋈", "⋉", "⋊", "⋋", "⋌", "⋍", "⋎", "⋏", "⋐", "⋑", "⋒", "⋓", "⋔", "⋕", "⋖", "⋗", "⋘", "⋙", "⋚", "⋛", "⋜", "⋝", "⋞", "⋟", "⋠", "⋡", "⋢", "⋣", "⋤", "⋥", "⋦", "⋧", "⋨", "⋩", "⋪", "⋫", "⋬", "⋭", "⋮", "⋯", "⋰", "⋱", "⋲", "⋳", "⋴", "⋵", "⋶", "⋷", "⋸", "⋹", "⋺", "⋻", "⋼", "⋽", "⋾", "⋿", "⌀", "⌁", "⌂", "⌃", "⌄", "⌅", "⌆", "⌇", "⌈", "⌉", "⌊", "⌋", "⌌", "⌍", "⌎", "⌏", "⌐", "⌑", "⌒", "⌓", "⌔", "⌕", "⌖", "⌗", "⌘", "⌙", "⌚", "⌛", "⌜", "⌝", "⌞", "⌟", "⌠", "⌡", "⌢", "⌣", "⌤", "⌥", "⌦", "⌧", "⌨", "〈", "〉", "⌫", "⌬", "⌭", "⌮", "⌯", "⌰", "⌱", "⌲", "⌳", "⌴", "⌵", "⌶", "⌷", "⌸", "⌹", "⌺", "⌻", "⌼", "⌽", "⌾", "⌿", "⍀", "⍁", "⍂", "⍃", "⍄", "⍅", "⍆", "⍇", "⍈", "⍉", "⍊", "⍋", "⍌", "⍍", "⍎", "⍏", "⍐", "⍑", "⍒", "⍓", "⍔", "⍕", "⍖", "⍗", "⍘", "⍙", "⍚", "⍛", "⍜", "⍝", "⍞", "⍟", "⍠", "⍡", "⍢", "⍣", "⍤", "⍥", "⍦", "⍧", "⍨", "⍩", "⍪", "⍫", "⍬", "⍭", "⍮", "⍯", "⍰", "⍱", "⍲", "⍳", "⍴", "⍵", "⍶", "⍷", "⍸", "⍹", "⍺", "⍻", "⍼", "⍽", "⍾", "⍿", "⎀", "⎁", "⎂", "⎃", "⎄", "⎅", "⎆", "⎇", "⎈", "⎉", "⎊", "⎋", "⎌", "⎍", "⎎", "⎏", "⎐", "⎑", "⎒", "⎓", "⎔", "⎕", "⎖", "⎗", "⎘", "⎙", "⎚", "⎛", "⎜", "⎝", "⎞", "⎟", "⎠", "⎡", "⎢", "⎣", "⎤", "⎥", "⎦", "⎧", "⎨", "⎩", "⎪", "⎫", "⎬", "⎭", "⎮", "⎯", "⎰", "⎱", "⎲", "⎳", "⎴", "⎵", "⎶", "⎷", "⎸", "⎹", "⎺", "⎻", "⎼", "⎽", "⎾", "⎿", "⏀", "⏁", "⏂", "⏃", "⏄", "⏅", "⏆", "⏇", "⏈", "⏉", "⏊", "⏋", "⏌", "⏍", "⏎", "⏏", "⏐", "⏑", "⏒", "⏓", "⏔", "⏕", "⏖", "⏗", "⏘", "⏙", "⏚", "⏛", "⏜", "⏝", "⏞", "⏟", "⏠", "⏡", "⏢", "⏣", "⏤", "⏥", "⏦", "⏧", "⏨", "⏩", "⏪", "⏫", "⏬", "⏭", "⏮", "⏯", "⏰", "⏱", "⏲", "⏳", "⏴", "⏵", "⏶", "⏷", "⏸", "⏹", "⏺", "☀", "☁", "☂", "☃", "☄", "★", "☆", "☇", "☈", "☉", "☊", "☋", "☌", "☍", "☎", "☏", "☐", "☑", "☒", "☓", "☔", "☕", "☖", "☗", "☘", "☙", "☚", "☛", "☜", "☝", "☞", "☟", "☠", "☡", "☢", "☣", "☤", "☥", "☦", "☧", "☨", "☩", "☪", "☫", "☬", "☭", "☮", "☯", "☰", "☱", "☲", "☳", "☴", "☵", "☶", "☷", "☸", "☹", "☺", "☻", "☼", "☽", "☾", "☿", "♀", "♁", "♂", "♃", "♄", "♅", "♆", "♇", "♈", "♉", "♊", "♋", "♌", "♍", "♎", "♏", "♐", "♑", "♒", "♓", "♔", "♕", "♖", "♗", "♘", "♙", "♚", "♛", "♜", "♝", "♞", "♟", "♠", "♡", "♢", "♣", "♤", "♥", "♦", "♧", "♨", "♩", "♪", "♫", "♬", "♭", "♮", "♯", "♰", "♱", "♲", "♳", "♴", "♵", "♶", "♷", "♸", "♹", "♺", "♻", "♼", "♽", "♾", "♿", "⚀", "⚁", "⚂", "⚃", "⚄", "⚅", "⚆", "⚇", "⚈", "⚉", "⚊", "⚋", "⚌", "⚍", "⚎", "⚏", "⚐", "⚑", "⚒", "⚓", "⚔", "⚕", "⚖", "⚗", "⚘", "⚙", "⚚", "⚛", "⚜", "⚝", "⚞", "⚟", "⚠", "⚡", "⚢", "⚣", "⚤", "⚥", "⚦", "⚧", "⚨", "⚩", "⚪", "⚫", "⚬", "⚭", "⚮", "⚯", "⚰", "⚱", "⚲", "⚳", "⚴", "⚵", "⚶", "⚷", "⚸", "⚹", "⚺", "⚻", "⚼", "⚽", "⚾", "⚿", "⛀", "⛁", "⛂", "⛃", "⛄", "⛅", "⛆", "⛇", "⛈", "⛉", "⛊", "⛋", "⛌", "⛍", "⛎", "⛏", "⛐", "⛑", "⛒", "⛓", "⛔", "⛕", "⛖", "⛗", "⛘", "⛙", "⛚", "⛛", "⛜", "⛝", "⛞", "⛟", "⛠", "⛡", "⛢", "⛣", "⛤", "⛥", "⛦", "⛧", "⛨", "⛩", "⛪", "⛫", "⛬", "⛭", "⛮", "⛯", "⛰", "⛱", "⛲", "⛳", "⛴", "⛵", "⛶", "⛷", "⛸", "⛹", "⛺", "⛻", "⛼", "⛽", "⛾", "⛿"
	};

	/** Array of target strings. */
	protected String[] targetArray = new String[]{
		"&#803;", "&#35;", "&#777;", "&#771;", "&#769;", "&#768;", "&#37;", "&amp;", "&lt;", "&gt;", "&#63;", "&quot;", "&#92;", "&iexcl;", "&cent;", "&pound;", "&curren;", "&yen;", "&brvbar;", "&sect;", "&uml;", "&copy;", "&ordf;", "&laquo;", "&not;", "&shy;", "&reg;", "&macr;", "&deg;", "&plusmn;", "&sup2;", "&sup3;", "&acute;", "&micro;", "&para;", "&middot;", "&cedil;", "&sup1;", "&ordm;", "&raquo;", "&frac14;", "&frac12;", "&frac34;", "&iquest;", "&Agrave;", "&Aacute;", "&Acirc;", "&Atilde;", "&Auml;", "&Aring;", "&AElig;", "&Ccedil;", "&Egrave;", "&Eacute;", "&Ecirc;", "&Euml;", "&Igrave;", "&Iacute;", "&Icirc;", "&Iuml;", "&ETH;", "&Ntilde;", "&Ograve;", "&Oacute;", "&Ocirc;", "&Otilde;", "&Ouml;", "&times;", "&Oslash;", "&Ugrave;", "&Uacute;", "&Ucirc;", "&Uuml;", "&Yacute;", "&THORN;", "&szlig;", "&agrave;", "&aacute;", "&acirc;", "&atilde;", "&auml;", "&aring;", "&aelig;", "&ccedil;", "&egrave;", "&eacute;", "&ecirc;", "&euml;", "&igrave;", "&iacute;", "&icirc;", "&iuml;", "&eth;", "&ntilde;", "&ograve;", "&oacute;", "&ocirc;", "&otilde;", "&ouml;", "&divide;", "&oslash", "&ugrave", "&uacute", "&ucirc;", "&uuml;", "&yacute;", "&thorn;", "&yuml;", "&#256;", "&#257;", "&#258;", "&#259;", "&#260;", "&#261;", "&#262;", "&#263;", "&#264;", "&#265;", "&#266;", "&#267;", "&#268;", "&#269;", "&#270;", "&#271;", "&#272;", "&#273;", "&#274;", "&#275;", "&#276;", "&#277;", "&#278;", "&#279;", "&#280;", "&#281;", "&#282;", "&#283;", "&#284;", "&#285;", "&#286;", "&#287;", "&#288;", "&#289;", "&#290;", "&#291;", "&#292;", "&#293;", "&#294;", "&#295;", "&#296;", "&#297;", "&#298;", "&#299;", "&#300;", "&#301;", "&#302;", "&#303;", "&#304;", "&#305;", "&#306;", "&#307;", "&#308;", "&#309;", "&#310;", "&#311;", "&#312;", "&#313;", "&#314;", "&#315;", "&#316;", "&#317;", "&#318;", "&#319;", "&#320;", "&#321;", "&#322;", "&#323;", "&#324;", "&#325;", "&#326;", "&#327;", "&#328;", "&#329;", "&#330;", "&#331;", "&#332;", "&#333;", "&#334;", "&#335;", "&#336;", "&#337;", "&OElig;", "&oelig;", "&#340;", "&#341;", "&#342;", "&#343;", "&#344;", "&#345;", "&#346;", "&#347;", "&#348;", "&#349;", "&#350;", "&#351;", "&Scaron;", "&scaron;", "&#354;", "&#355;", "&#356;", "&#357;", "&#358;", "&#359;", "&#360;", "&#361;", "&#362;", "&#363;", "&#364;", "&#365;", "&#366;", "&#367;", "&#368;", "&#369;", "&#370;", "&#371;", "&#372;", "&#373;", "&#374;", "&#375;", "&Yuml;", "&#377;", "&#378;", "&#379;", "&#380;", "&#381;", "&#382;", "&#383;", "&#384;", "&#385;", "&#386;", "&#387;", "&#388;", "&#389;", "&#390;", "&#391;", "&#392;", "&#393;", "&#394;", "&#395;", "&#396;", "&#397;", "&#398;", "&#399;", "&#400;", "&#401;", "&#402;", "&#403;", "&#404;", "&#405;", "&#406;", "&#407;", "&#408;", "&#409;", "&#410;", "&#411;", "&#412;", "&#413;", "&#414;", "&#415;", "&#416;", "&#417;", "&#418;", "&#419;", "&#420;", "&#421;", "&#422;", "&#423;", "&#424;", "&#425;", "&#426;", "&#427;", "&#428;", "&#429;", "&#430;", "&#431;", "&#432;", "&#433;", "&#434;", "&#435;", "&#436;", "&#437;", "&#438;", "&#439;", "&#440;", "&#441;", "&#442;", "&#443;", "&#444;", "&#445;", "&#446;", "&#447;", "&#448;", "&#449;", "&#450;", "&#451;", "&#452;", "&#453;", "&#454;", "&#455;", "&#456;", "&#457;", "&#458;", "&#459;", "&#460;", "&#461;", "&#462;", "&#463;", "&#464;", "&#465;", "&#466;", "&#467;", "&#468;", "&#469;", "&#470;", "&#471;", "&#472;", "&#473;", "&#474;", "&#475;", "&#476;", "&#477;", "&#478;", "&#479;", "&#480;", "&#481;", "&#482;", "&#483;", "&#484;", "&#485;", "&#486;", "&#487;", "&#488;", "&#489;", "&#490;", "&#491;", "&#492;", "&#493;", "&#494;", "&#495;", "&#496;", "&#497;", "&#498;", "&#499;", "&#500;", "&#501;", "&#502;", "&#503;", "&#504;", "&#505;", "&#506;", "&#507;", "&#508;", "&#509;", "&#510;", "&#511;", "&#512;", "&#513;", "&#514;", "&#515;", "&#516;", "&#517;", "&#518;", "&#519;", "&#520;", "&#521;", "&#522;", "&#523;", "&#524;", "&#525;", "&#526;", "&#527;", "&#528;", "&#529;", "&#530;", "&#531;", "&#532;", "&#533;", "&#534;", "&#535;", "&#536;", "&#537;", "&#538;", "&#539;", "&#540;", "&#541;", "&#542;", "&#543;", "&#544;", "&#545;", "&#546;", "&#547;", "&#548;", "&#549;", "&#550;", "&#551;", "&#552;", "&#553;", "&#554;", "&#555;", "&#556;", "&#557;", "&#558;", "&#559;", "&#560;", "&#561;", "&#562;", "&#563;", "&#564;", "&#565;", "&#566;", "&#567;", "&#568;", "&#569;", "&#570;", "&#571;", "&#572;", "&#573;", "&#574;", "&#575;", "&#576;", "&#577;", "&#578;", "&#579;", "&#580;", "&#581;", "&#582;", "&#583;", "&#584;", "&#585;", "&#586;", "&#587;", "&#588;", "&#589;", "&#590;", "&#591;", "&#688;", "&#689;", "&#690;", "&#691;", "&#692;", "&#693;", "&#694;", "&#695;", "&#696;", "&#697;", "&#698;", "&#699;", "&#700;", "&#701;", "&#702;", "&#703;", "&#704;", "&#705;", "&#706;", "&#707;", "&#708;", "&#709;", "&#710;", "&#711;", "&#712;", "&#713;", "&#714;", "&#715;", "&#716;", "&#717;", "&#718;", "&#719;", "&#720;", "&#721;", "&#722;", "&#723;", "&#724;", "&#725;", "&#726;", "&#727;", "&#728;", "&#729;", "&#730;", "&#731;", "&#732;", "&#733;", "&#734;", "&#735;", "&#736;", "&#737;", "&#738;", "&#739;", "&#740;", "&#741;", "&#742;", "&#743;", "&#744;", "&#745;", "&#746;", "&#747;", "&#748;", "&#749;", "&#750;", "&#751;", "&#752;", "&#753;", "&#754;", "&#755;", "&#756;", "&#757;", "&#758;", "&#759;", "&#760;", "&#761;", "&#762;", "&#763;", "&#764;", "&#765;", "&#766;", "&#767;", "&#770;", "&#772;", "&#773;", "&#774;", "&#775;", "&#776;", "&#778;", "&#779;", "&#780;", "&#781;", "&#782;", "&#783;", "&#784;", "&#785;", "&#786;", "&#787;", "&#788;", "&#789;", "&#790;", "&#791;", "&#792;", "&#793;", "&#794;", "&#795;", "&#796;", "&#797;", "&#798;", "&#799;", "&#800;", "&#801;", "&#802;", "&#804;", "&#805;", "&#806;", "&#807;", "&#808;", "&#809;", "&#810;", "&#811;", "&#812;", "&#813;", "&#814;", "&#815;", "&#816;", "&#817;", "&#818;", "&#819;", "&#820;", "&#821;", "&#822;", "&#823;", "&#824;", "&#825;", "&#826;", "&#827;", "&#828;", "&#829;", "&#830;", "&#831;", "&#832;", "&#833;", "&#834;", "&#835;", "&#836;", "&#837;", "&#838;", "&#839;", "&#840;", "&#841;", "&#842;", "&#843;", "&#844;", "&#845;", "&#846;", "&#847;", "&#848;", "&#849;", "&#850;", "&#851;", "&#852;", "&#853;", "&#854;", "&#855;", "&#856;", "&#857;", "&#858;", "&#859;", "&#860;", "&#861;", "&#862;", "&#863;", "&#864;", "&#865;", "&#866;", "&#867;", "&#868;", "&#869;", "&#870;", "&#871;", "&#872;", "&#873;", "&#874;", "&#875;", "&#876;", "&#877;", "&#878;", "&#879;", "&#880;", "&#881;", "&#882;", "&#883;", "&#884;", "&#885;", "&#886;", "&#887;", "&#890;", "&#891;", "&#892;", "&#893;", "&#894;", "&#895;", "&#900;", "&#901;", "&#902;", "&#903;", "&#904;", "&#905;", "&#906;", "&#908;", "&#910;", "&#911;", "&#912;", "&Alpha;", "Beta;", "&Gamma;", "&Delta;", "&Epsilon;", "&Zeta;", "&Eta;", "&Theta;", "&Iota;", "&Kappa;", "&Lambda;", "&Mu;", "&Nu;", "&Xi;", "&Omicron;", "&Pi;", "&Rho;", "&Sigma;", "&Tau;", "&Upsilon;", "&Phi;", "&Chi;", "&Psi;", "&Omega;", "&#938;", "&#939;", "&#940;", "&#941;", "&#942;", "&#943;", "&#944;", "&alpha;", "&beta;", "&gamma;", "&delta;", "&epsilon;", "&zeta;", "&eta;", "&theta;", "&iota;", "&kappa;", "&lambda;", "&mu;", "&nu;", "&xi;", "&omicron;", "&pi;", "&rho;", "&sigmaf;", "&sigma;", "&tau;", "&upsilon;", "&phi;", "&chi;", "&psi;", "&omega;", "&#970;", "&#971;", "&#972;", "&#973;", "&#974;", "&#975;", "&#976;", "&thetasym;", "&upsih;", "&#979;", "&#980;", "&#981;", "&piv;", "&#983;", "&#984;", "&#985;", "&#986;", "&#987;", "&#988;", "&#989;", "&#990;", "&#991;", "&#992;", "&#993;", "&#994;", "&#995;", "&#996;", "&#997;", "&#998;", "&#999;", "&#1000;", "&#1001;", "&#1002;", "&#1003;", "&#1004;", "&#1005;", "&#1006;", "&#1007;", "&#1008;", "&#1009;", "&#1010;", "&#1011;", "&#1012;", "&#1013;", "&#1014;", "&#1015;", "&#1016;", "&#1017;", "&#1018;", "&#1019;", "&#1020;", "&#1021;", "&#1022;", "&#1023;", "&#7680;", "&#7681;", "&#7682;", "&#7683;", "&#7684;", "&#7685;", "&#7686;", "&#7687;", "&#7688;", "&#7689;", "&#7690;", "&#7691;", "&#7692;", "&#7693;", "&#7694;", "&#7695;", "&#7696;", "&#7697;", "&#7698;", "&#7699;", "&#7700;", "&#7701;", "&#7702;", "&#7703;", "&#7704;", "&#7705;", "&#7706;", "&#7707;", "&#7708;", "&#7709;", "&#7710;", "&#7711;", "&#7712;", "&#7713;", "&#7714;", "&#7715;", "&#7716;", "&#7717;", "&#7718;", "&#7719;", "&#7720;", "&#7721;", "&#7722;", "&#7723;", "&#7724;", "&#7725;", "&#7726;", "&#7727;", "&#7728;", "&#7729;", "&#7730;", "&#7731;", "&#7732;", "&#7733;", "&#7734;", "&#7735;", "&#7736;", "&#7737;", "&#7738;", "&#7739;", "&#7740;", "&#7741;", "&#7742;", "&#7743;", "&#7744;", "&#7745;", "&#7746;", "&#7747;", "&#7748;", "&#7749;", "&#7750;", "&#7751;", "&#7752;", "&#7753;", "&#7754;", "&#7755;", "&#7756;", "&#7757;", "&#7758;", "&#7759;", "&#7760;", "&#7761;", "&#7762;", "&#7763;", "&#7764;", "&#7765;", "&#7766;", "&#7767;", "&#7768;", "&#7769;", "&#7770;", "&#7771;", "&#7772;", "&#7773;", "&#7774;", "&#7775;", "&#7776;", "&#7777;", "&#7778;", "&#7779;", "&#7780;", "&#7781;", "&#7782;", "&#7783;", "&#7784;", "&#7785;", "&#7786;", "&#7787;", "&#7788;", "&#7789;", "&#7790;", "&#7791;", "&#7792;", "&#7793;", "&#7794;", "&#7795;", "&#7796;", "&#7797;", "&#7798;", "&#7799;", "&#7800;", "&#7801;", "&#7802;", "&#7803;", "&#7804;", "&#7805;", "&#7806;", "&#7807;", "&#7808;", "&#7809;", "&#7810;", "&#7811;", "&#7812;", "&#7813;", "&#7814;", "&#7815;", "&#7816;", "&#7817;", "&#7818;", "&#7819;", "&#7820;", "&#7821;", "&#7822;", "&#7823;", "&#7824;", "&#7825;", "&#7826;", "&#7827;", "&#7828;", "&#7829;", "&#7830;", "&#7831;", "&#7832;", "&#7833;", "&#7834;", "&#7835;", "&#7836;", "&#7837;", "&#7838;", "&#7839;", "&#7840;", "&#7841;", "&#7842;", "&#7843;", "&#7844;", "&#7845;", "&#7846;", "&#7847;", "&#7848;", "&#7849;", "&#7850;", "&#7851;", "&#7852;", "&#7853;", "&#7854;", "&#7855;", "&#7856;", "&#7857;", "&#7858;", "&#7859;", "&#7860;", "&#7861;", "&#7862;", "&#7863;", "&#7864;", "&#7865;", "&#7866;", "&#7867;", "&#7868;", "&#7869;", "&#7870;", "&#7871;", "&#7872;", "&#7873;", "&#7874;", "&#7875;", "&#7876;", "&#7877;", "&#7878;", "&#7879;", "&#7880;", "&#7881;", "&#7882;", "&#7883;", "&#7884;", "&#7885;", "&#7886;", "&#7887;", "&#7888;", "&#7889;", "&#7890;", "&#7891;", "&#7892;", "&#7893;", "&#7894;", "&#7895;", "&#7896;", "&#7897;", "&#7898;", "&#7899;", "&#7900;", "&#7901;", "&#7902;", "&#7903;", "&#7904;", "&#7905;", "&#7906;", "&#7907;", "&#7908;", "&#7909;", "&#7910;", "&#7911;", "&#7912;", "&#7913;", "&#7914;", "&#7915;", "&#7916;", "&#7917;", "&#7918;", "&#7919;", "&#7920;", "&#7921;", "&#7922;", "&#7923;", "&#7924;", "&#7925;", "&#7926;", "&#7927;", "&#7928;", "&#7929;", "&#7930;", "&#7931;", "&#7932;", "&#7933;", "&#7934;", "&#7935;", "&#8208;", "&#8209;", "&#8210;", "&ndash;", "&mdash;", "&#8213;", "&#8214;", "&#8215;", "&lsquo;", "&rsquo;", "&sbquo;", "&#8219;", "&ldquo;", "&rdquo;", "&bdquo;", "&#8223;", "&dagger;", "&Dagger;", "&bull;", "&#8227;", "&#8228;", "&#8229;", "&hellip;", "&#8231;", "&#8232;", "&permil;", "&#8241;", "&prime;", "&Prime;", "&#8244;", "&#8245;", "&#8246;", "&#8247;", "&#8248;", "&lsaquo;", "&rsaquo;", "&#8251;", "&#8252;", "&#8253;", "&oline;", "&#8255;", "&#8256;", "&#8257;", "&#8258;", "&#8259;", "&frasl;", "&#8261;", "&#8262;", "&#8263;", "&#8264;", "&#8265;", "&#8266;", "&#8267;", "&#8268;", "&#8269;", "&#8270;", "&#8271;", "&#8272;", "&#8273;", "&#8274;", "&#8275;", "&#8276;", "&#8277;", "&#8278;", "&#8279;", "&#8280;", "&#8281;", "&#8282;", "&#8283;", "&#8284;", "&#8285;", "&#8286;", "&#8287;", "&#8352;", "&#8353;", "&#8354;", "&#8355;", "&#8356;", "&#8357;", "&#8358;", "&#8359;", "&#8360;", "&#8361;", "&#8362;", "&#8363;", "&euro;", "&#8365;", "&#8366;", "&#8367;", "&#8368;", "&#8369;", "&#8370;", "&#8371;", "&#8372;", "&#8373;", "&#8374;", "&#8375;", "&#8376;", "&#8377;", "&#8378;", "&#8379;", "&#8380;", "&#8381;", "&#8448;", "&#8449;", "&#8450;", "&#8451;", "&#8452;", "&#8453;", "&#8454;", "&#8455;", "&#8456;", "&#8457;", "&#8458;", "&#8459;", "&#8460;", "&#8461;", "&#8462;", "&#8463;", "&#8464;", "&image;", "&#8466;", "&#8467;", "&#8468;", "&#8469;", "&#8470;", "&#8471;", "&weierp;", "&#8473;", "&#8474;", "&#8475;", "&#8476;", "&#8477;", "&#8478;", "&#8479;", "&#8480;", "&#8481;", "&trade;", "&#8483;", "&#8484;", "&#8485;", "&#8486;", "&#8487;", "&#8488;", "&#8489;", "&#8490;", "&#8491;", "&#8492;", "&#8493;", "&#8494;", "&#8495;", "&#8496;", "&#8497;", "&#8498;", "&#8499;", "&#8500;", "&alefsym;", "&#8502;", "&#8503;", "&#8504;", "&#8505;", "&#8506;", "&#8507;", "&#8508;", "&#8509;", "&#8510;", "&#8511;", "&#8512;", "&#8513;", "&#8514;", "&#8515;", "&#8516;", "&#8517;", "&#8518;", "&#8519;", "&#8520;", "&#8521;", "&#8522;", "&#8523;", "&#8524;", "&#8525;", "&#8526;", "&#8527;", "&larr;", "&uarr;", "&rarr;", "&darr;", "&harr;", "&#8597;", "&#8598;", "&#8599;", "&#8600;", "&#8601;", "&#8602;", "&#8603;", "&#8604;", "&#8605;", "&#8606;", "&#8607;", "&#8608;", "&#8609;", "&#8610;", "&#8611;", "&#8612;", "&#8613;", "&#8614;", "&#8615;", "&#8616;", "&#8617;", "&#8618;", "&#8619;", "&#8620;", "&#8621;", "&#8622;", "&#8623;", "&#8624;", "&#8625;", "&#8626;", "&#8627;", "&#8628;", "&crarr;", "&#8630;", "&#8631;", "&#8632;", "&#8633;", "&#8634;", "&#8635;", "&#8636;", "&#8637;", "&#8638;", "&#8639;", "&#8640;", "&#8641;", "&#8642;", "&#8643;", "&#8644;", "&#8645;", "&#8646;", "&#8647;", "&#8648;", "&#8649;", "&#8650;", "&#8651;", "&#8652;", "&#8653;", "&#8654;", "&#8655;", "&lArr;", "&uArr;", "&rArr;", "&dArr;", "&hArr;", "&#8661;", "&#8662;", "&#8663;", "&#8664;", "&#8665;", "&#8666;", "&#8667;", "&#8668;", "&#8669;", "&#8670;", "&#8671;", "&#8672;", "&#8673;", "&#8674;", "&#8675;", "&#8676;", "&#8677;", "&#8678;", "&#8679;", "&#8680;", "&#8681;", "&#8682;", "&#8683;", "&#8684;", "&#8685;", "&#8686;", "&#8687;", "&#8688;", "&#8689;", "&#8690;", "&#8691;", "&#8692;", "&#8693;", "&#8694;", "&#8695;", "&#8696;", "&#8697;", "&#8698;", "&#8699;", "&#8700;", "&#8701;", "&#8702;", "&#8703;", "&forall;", "&#8705;", "&part;", "&exist;", "&#8708;", "&empty;", "&#8710;", "&nabla;", "&isin;", "&notin;", "&#8714;", "&ni;", "&#8716;", "&#8717;", "&#8718;", "&prod;", "&#8720;", "&sum;", "&minus;", "&#8723;", "&#8724;", "&#8725;", "&#8726;", "&lowast;", "&#8728;", "&#8729;", "&radic;", "&#8731;", "&#8732;", "&prop;", "&infin;", "&#8735;", "&ang;", "&#8737;", "&#8738;", "&#8739;", "&#8740;", "&#8741;", "&#8742;", "&and;", "&or;", "&cap;", "&cup;", "&int;", "&#8748;", "&#8749;", "&#8750;", "&#8751;", "&#8752;", "&#8753;", "&#8754;", "&#8755;", "&there4;", "&#8757;", "&#8758;", "&#8759;", "&#8760;", "&#8761;", "&#8762;", "&#8763;", "&sim;", "&#8765;", "&#8766;", "&#8767;", "&#8768;", "&#8769;", "&#8770;", "&#8771;", "&#8772;", "&cong;", "&#8774;", "&#8775;", "&asymp;", "&#8777;", "&#8778;", "&#8779;", "&#8780;", "&#8781;", "&#8782;", "&#8783;", "&#8784;", "&#8785;", "&#8786;", "&#8787;", "&#8788;", "&#8789;", "&#8790;", "&#8791;", "&#8792;", "&#8793;", "&#8794;", "&#8795;", "&#8796;", "&#8797;", "&#8798;", "&#8799;", "&ne;", "&equiv;", "&#8802;", "&#8803;", "&le;", "&ge;", "&#8806;", "&#8807;", "&#8808;", "&#8809;", "&#8810;", "&#8811;", "&#8812;", "&#8813;", "&#8814;", "&#8815;", "&#8816;", "&#8817;", "&#8818;", "&#8819;", "&#8820;", "&#8821;", "&#8822;", "&#8823;", "&#8824;", "&#8825;", "&#8826;", "&#8827;", "&#8828;", "&#8829;", "&#8830;", "&#8831;", "&#8832;", "&#8833;", "&sub;", "&sup;", "&nsub;", "&#8837;", "&sube;", "&supe;", "&#8840;", "&#8841;", "&#8842;", "&#8843;", "&#8844;", "&#8845;", "&#8846;", "&#8847;", "&#8848;", "&#8849;", "&#8850;", "&#8851;", "&#8852;", "&oplus;", "&#8854;", "&otimes;", "&#8856;", "&#8857;", "&#8858;", "&#8859;", "&#8860;", "&#8861;", "&#8862;", "&#8863;", "&#8864;", "&#8865;", "&#8866;", "&#8867;", "&#8868;", "&perp;", "&#8870;", "&#8871;", "&#8872;", "&#8873;", "&#8874;", "&#8875;", "&#8876;", "&#8877;", "&#8878;", "&#8879;", "&#8880;", "&#8881;", "&#8882;", "&#8883;", "&#8884;", "&#8885;", "&#8886;", "&#8887;", "&#8888;", "&#8889;", "&#8890;", "&#8891;", "&#8892;", "&#8893;", "&#8894;", "&#8895;", "&#8896;", "&#8897;", "&#8898;", "&#8899;", "&#8900;", "&sdot;", "&#8902;", "&#8903;", "&#8904;", "&#8905;", "&#8906;", "&#8907;", "&#8908;", "&#8909;", "&#8910;", "&#8911;", "&#8912;", "&#8913;", "&#8914;", "&#8915;", "&#8916;", "&#8917;", "&#8918;", "&#8919;", "&#8920;", "&#8921;", "&#8922;", "&#8923;", "&#8924;", "&#8925;", "&#8926;", "&#8927;", "&#8928;", "&#8929;", "&#8930;", "&#8931;", "&#8932;", "&#8933;", "&#8934;", "&#8935;", "&#8936;", "&#8937;", "&#8938;", "&#8939;", "&#8940;", "&#8941;", "&#8942;", "&#8943;", "&#8944;", "&#8945;", "&#8946;", "&#8947;", "&#8948;", "&#8949;", "&#8950;", "&#8951;", "&#8952;", "&#8953;", "&#8954;", "&#8955;", "&#8956;", "&#8957;", "&#8958;", "&#8959;", "&#8960;", "&#8961;", "&#8962;", "&#8963;", "&#8964;", "&#8965;", "&#8966;", "&#8967;", "&lceil;", "&rceil;", "&lfloor;", "&rfloor;", "&#8972;", "&#8973;", "&#8974;", "&#8975;", "&#8976;", "&#8977;", "&#8978;", "&#8979;", "&#8980;", "&#8981;", "&#8982;", "&#8983;", "&#8984;", "&#8985;", "&#8986;", "&#8987;", "&#8988;", "&#8989;", "&#8990;", "&#8991;", "&#8992;", "&#8993;", "&#8994;", "&#8995;", "&#8996;", "&#8997;", "&#8998;", "&#8999;", "&#9000;", "&lang;", "&rang;", "&#9003;", "&#9004;", "&#9005;", "&#9006;", "&#9007;", "&#9008;", "&#9009;", "&#9010;", "&#9011;", "&#9012;", "&#9013;", "&#9014;", "&#9015;", "&#9016;", "&#9017;", "&#9018;", "&#9019;", "&#9020;", "&#9021;", "&#9022;", "&#9023;", "&#9024;", "&#9025;", "&#9026;", "&#9027;", "&#9028;", "&#9029;", "&#9030;", "&#9031;", "&#9032;", "&#9033;", "&#9034;", "&#9035;", "&#9036;", "&#9037;", "&#9038;", "&#9039;", "&#9040;", "&#9041;", "&#9042;", "&#9043;", "&#9044;", "&#9045;", "&#9046;", "&#9047;", "&#9048;", "&#9049;", "&#9050;", "&#9051;", "&#9052;", "&#9053;", "&#9054;", "&#9055;", "&#9056;", "&#9057;", "&#9058;", "&#9059;", "&#9060;", "&#9061;", "&#9062;", "&#9063;", "&#9064;", "&#9065;", "&#9066;", "&#9067;", "&#9068;", "&#9069;", "&#9070;", "&#9071;", "&#9072;", "&#9073;", "&#9074;", "&#9075;", "&#9076;", "&#9077;", "&#9078;", "&#9079;", "&#9080;", "&#9081;", "&#9082;", "&#9083;", "&#9084;", "&#9085;", "&#9086;", "&#9087;", "&#9088;", "&#9089;", "&#9090;", "&#9091;", "&#9092;", "&#9093;", "&#9094;", "&#9095;", "&#9096;", "&#9097;", "&#9098;", "&#9099;", "&#9100;", "&#9101;", "&#9102;", "&#9103;", "&#9104;", "&#9105;", "&#9106;", "&#9107;", "&#9108;", "&#9109;", "&#9110;", "&#9111;", "&#9112;", "&#9113;", "&#9114;", "&#9115;", "&#9116;", "&#9117;", "&#9118;", "&#9119;", "&#9120;", "&#9121;", "&#9122;", "&#9123;", "&#9124;", "&#9125;", "&#9126;", "&#9127;", "&#9128;", "&#9129;", "&#9130;", "&#9131;", "&#9132;", "&#9133;", "&#9134;", "&#9135;", "&#9136;", "&#9137;", "&#9138;", "&#9139;", "&#9140;", "&#9141;", "&#9142;", "&#9143;", "&#9144;", "&#9145;", "&#9146;", "&#9147;", "&#9148;", "&#9149;", "&#9150;", "&#9151;", "&#9152;", "&#9153;", "&#9154;", "&#9155;", "&#9156;", "&#9157;", "&#9158;", "&#9159;", "&#9160;", "&#9161;", "&#9162;", "&#9163;", "&#9164;", "&#9165;", "&#9166;", "&#9167;", "&#9168;", "&#9169;", "&#9170;", "&#9171;", "&#9172;", "&#9173;", "&#9174;", "&#9175;", "&#9176;", "&#9177;", "&#9178;", "&#9179;", "&#9180;", "&#9181;", "&#9182;", "&#9183;", "&#9184;", "&#9185;", "&#9186;", "&#9187;", "&#9188;", "&#9189;", "&#9190;", "&#9191;", "&#9192;", "&#9193;", "&#9194;", "&#9195;", "&#9196;", "&#9197;", "&#9198;", "&#9199;", "&#9200;", "&#9201;", "&#9202;", "&#9203;", "&#9204;", "&#9205;", "&#9206;", "&#9207;", "&#9208;", "&#9209;", "&#9210;", "&#9728;", "&#9729;", "&#9730;", "&#9731;", "&#9732;", "&#9733;", "&#9734;", "&#9735;", "&#9736;", "&#9737;", "&#9738;", "&#9739;", "&#9740;", "&#9741;", "&#9742;", "&#9743;", "&#9744;", "&#9745;", "&#9746;", "&#9747;", "&#9748;", "&#9749;", "&#9750;", "&#9751;", "&#9752;", "&#9753;", "&#9754;", "&#9755;", "&#9756;", "&#9757;", "&#9758;", "&#9759;", "&#9760;", "&#9761;", "&#9762;", "&#9763;", "&#9764;", "&#9765;", "&#9766;", "&#9767;", "&#9768;", "&#9769;", "&#9770;", "&#9771;", "&#9772;", "&#9773;", "&#9774;", "&#9775;", "&#9776;", "&#9777;", "&#9778;", "&#9779;", "&#9780;", "&#9781;", "&#9782;", "&#9783;", "&#9784;", "&#9785;", "&#9786;", "&#9787;", "&#9788;", "&#9789;", "&#9790;", "&#9791;", "&#9792;", "&#9793;", "&#9794;", "&#9795;", "&#9796;", "&#9797;", "&#9798;", "&#9799;", "&#9800;", "&#9801;", "&#9802;", "&#9803;", "&#9804;", "&#9805;", "&#9806;", "&#9807;", "&#9808;", "&#9809;", "&#9810;", "&#9811;", "&#9812;", "&#9813;", "&#9814;", "&#9815;", "&#9816;", "&#9817;", "&#9818;", "&#9819;", "&#9820;", "&#9821;", "&#9822;", "&#9823;", "&spades;", "&#9825;", "&#9826;", "&clubs;", "&#9828;", "&hearts;", "&diams;", "&#9831;", "&#9832;", "&#9833;", "&#9834;", "&#9835;", "&#9836;", "&#9837;", "&#9838;", "&#9839;", "&#9840;", "&#9841;", "&#9842;", "&#9843;", "&#9844;", "&#9845;", "&#9846;", "&#9847;", "&#9848;", "&#9849;", "&#9850;", "&#9851;", "&#9852;", "&#9853;", "&#9854;", "&#9855;", "&#9856;", "&#9857;", "&#9858;", "&#9859;", "&#9860;", "&#9861;", "&#9862;", "&#9863;", "&#9864;", "&#9865;", "&#9866;", "&#9867;", "&#9868;", "&#9869;", "&#9870;", "&#9871;", "&#9872;", "&#9873;", "&#9874;", "&#9875;", "&#9876;", "&#9877;", "&#9878;", "&#9879;", "&#9880;", "&#9881;", "&#9882;", "&#9883;", "&#9884;", "&#9885;", "&#9886;", "&#9887;", "&#9888;", "&#9889;", "&#9890;", "&#9891;", "&#9892;", "&#9893;", "&#9894;", "&#9895;", "&#9896;", "&#9897;", "&#9898;", "&#9899;", "&#9900;", "&#9901;", "&#9902;", "&#9903;", "&#9904;", "&#9905;", "&#9906;", "&#9907;", "&#9908;", "&#9909;", "&#9910;", "&#9911;", "&#9912;", "&#9913;", "&#9914;", "&#9915;", "&#9916;", "&#9917;", "&#9918;", "&#9919;", "&#9920;", "&#9921;", "&#9922;", "&#9923;", "&#9924;", "&#9925;", "&#9926;", "&#9927;", "&#9928;", "&#9929;", "&#9930;", "&#9931;", "&#9932;", "&#9933;", "&#9934;", "&#9935;", "&#9936;", "&#9937;", "&#9938;", "&#9939;", "&#9940;", "&#9941;", "&#9942;", "&#9943;", "&#9944;", "&#9945;", "&#9946;", "&#9947;", "&#9948;", "&#9949;", "&#9950;", "&#9951;", "&#9952;", "&#9953;", "&#9954;", "&#9955;", "&#9956;", "&#9957;", "&#9958;", "&#9959;", "&#9960;", "&#9961;", "&#9962;", "&#9963;", "&#9964;", "&#9965;", "&#9966;", "&#9967;", "&#9968;", "&#9969;", "&#9970;", "&#9971;", "&#9972;", "&#9973;", "&#9974;", "&#9975;", "&#9976;", "&#9977;", "&#9978;", "&#9979;", "&#9980;", "&#9981;", "&#9982;", "&#9983;"
	};

	@Override
	public String translateCharacters(String input){
		return StringUtils.replaceEach(input, this.sourceArray, this.targetArray);
	}
}
