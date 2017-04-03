/* Copyright 2016 Sven van der Meer <vdmeer.sven@mykolab.com\>
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

package de.vandermeer.translation.targets;

import de.vandermeer.skb.interfaces.translators.CharacterTranslator;
import de.vandermeer.skb.interfaces.translators.CombinedTranslator;
import de.vandermeer.skb.interfaces.translators.HtmlElementTranslator;
import de.vandermeer.skb.interfaces.translators.TargetTranslator;

/**
 * Target translator for source Text and target AsciiDoc.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.0.1 build 170331 (31-Mar-17) for Java 1.8
 * @since      v0.0.2
 */
public class Text2AsciiDoc implements TargetTranslator {

	@Override
	public CharacterTranslator getCharacterTranslator() {
		return new de.vandermeer.translation.characters.Text2AsciiDoc();
	}

	@Override
	public HtmlElementTranslator getHtmlElementTanslator() {
		return new de.vandermeer.translation.helements.Text2AsciiDoc();
	}

	@Override
	public CombinedTranslator getCombinedTranslator() {
		return new de.vandermeer.translation.combinations.Text2AsciiDoc();
	}

}
