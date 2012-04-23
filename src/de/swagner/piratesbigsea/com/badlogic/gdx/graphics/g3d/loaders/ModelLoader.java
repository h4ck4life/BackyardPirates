/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.swagner.piratesbigsea.com.badlogic.gdx.graphics.g3d.loaders;

import com.badlogic.gdx.files.FileHandle;

import de.swagner.piratesbigsea.com.badlogic.gdx.graphics.g3d.ModelLoaderHints;
import de.swagner.piratesbigsea.com.badlogic.gdx.graphics.g3d.model.Model;

/** Interface for all loaders. Loaders that need more files need to derrive the other file names by the given file. A bit of a
 * hack, but most formats are self contained.
 * 
 * @author mzechner */
public interface ModelLoader {
	public Model load (FileHandle file, ModelLoaderHints hints);
}